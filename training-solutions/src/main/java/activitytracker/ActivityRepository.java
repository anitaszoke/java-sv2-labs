package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityRepository {

    private DataSource dataSource;

    public ActivityRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void saveActivity(Activity activity) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement
                     ("insert into activities(start_time, activity_desc, activity_type) values (?, ?, ?);")) {
            setStmtActivity(activity, stmt);

            stmt.executeUpdate();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot save", sqle);
        }
    }

    private void setStmtActivity(Activity activity, PreparedStatement stmt) throws SQLException {

        stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
        stmt.setString(2, activity.getDesc());
        stmt.setString(3, activity.getType().toString());

    }

    public Activity saveActivityAndReturnGeneratedKeys(Activity activity) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement(
                     "insert into activities(start_time, description, activity_type) values (?, ?, ?);",
                     Statement.RETURN_GENERATED_KEYS)) {

            setStmtActivity(activity,stmt);
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                return new Activity(rs.getInt(1), activity.getStartTime(), activity.getDesc(), activity.getType());
            }
            throw new IllegalStateException("Cannot get keys.");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert.", sqle);
        }
    }

    public Activity findActivityById(long id){
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement stmt = connection.prepareStatement
                        ("SELECT * FROM activities WHERE id = ?;")
        ) {
            stmt.setInt(1, (int)id);
            return getFirstActivityByQuery(stmt);

        } catch (SQLException sqle) {
            throw new IllegalStateException("Error select", sqle);
        }
    }

    private Activity getFirstActivityByQuery(PreparedStatement stmt) {
        try (ResultSet result = stmt.executeQuery()) {
            if (result.next()) {
                return new Activity(
                        result.getInt("id"),
                        result.getTimestamp("start_time").toLocalDateTime(),
                        result.getString("activity_desc"),
                        Type.valueOf(result.getString("activity_type"))
                );
            } else {
                throw new IllegalArgumentException("Cannot query " + stmt);
            }
        } catch (SQLException sqlerr) {
            throw new IllegalStateException("Error select", sqlerr);
        }
    }

    public List<Activity> listActivities() {
        List<Activity> allActivities = new ArrayList<>();

        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery
                     ("select * from activities")) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                LocalDateTime startTime = resultSet.getTimestamp("start_time").toLocalDateTime();
                String description = resultSet.getString("description");
                Type activityType = Type.valueOf(resultSet.getString("activity_type"));

                allActivities.add(new Activity(id, startTime, description, activityType));
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot query");
        }
        return allActivities;

    }

    public void saveActivityAndSaveTrackPoints(Activity activity) {
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);
            try {
                int activityId = saveActivityWithTrackPoints(activity, conn);
                saveTrackPoints(activityId, activity, conn);
                conn.commit();
            } catch (Exception ex) {
                conn.rollback();
                throw new IllegalArgumentException("Transaction not succeeded!", ex);
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Wrong connection.", sqle);
        }
    }

    private int saveActivityWithTrackPoints(Activity activity, Connection conn) throws SQLException {
        int activityId = 0;
        try (PreparedStatement stmt = conn.prepareStatement
                ("insert into activities(start_time, description, activity_type) values (?, ?, ?);",
                Statement.RETURN_GENERATED_KEYS)) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                activityId = rs.getInt(1);
            }
            return activityId;
        }
    }

    private void saveTrackPoints(int activityId, Activity activity, Connection conn) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement
                ("insert into track_point(id, tp_time, lat, lon) values (?, ?, ?, ?);")) {
            List<TrackPoint> trackpoints = activity.getTrackpoints();
            for (TrackPoint t : trackpoints) {
                if (t.getLat() < -90.0 || t.getLat() > 90.0 || t.getLon() < -180 || t.getLon() > 180.0) {
                    throw new IllegalArgumentException("Wrong values for latitude or longitude!");
                }
                stmt.setInt(1, activityId);
                stmt.setDate(2, Date.valueOf(t.getTime()));
                stmt.setDouble(3, t.getLat());
                stmt.setDouble(4, t.getLon());

                stmt.executeUpdate();
            }
        }
    }

    public Activity findActivityWithTrackPointsById(int id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement
                     ("select * from activities where id = ?;")) {
            stmt.setInt(1, id);
            return getActivityById(id, stmt, conn);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Wrong activity or trackpoints.", sqle);
        }
    }

    private Activity getActivityById(int id, PreparedStatement stmt, Connection conn) throws SQLException {
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
                String description = rs.getString("description");
                Type type = Type.valueOf(rs.getString("activity_type"));
                List<TrackPoint> trackpoints = getTrackPoints(id, conn);
                return new Activity(id, startTime, description, type, trackpoints);
            }
            throw new IllegalArgumentException("No activity with this id.");
        }
    }

    private List<TrackPoint> getTrackPoints(int id, Connection conn) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement("select * from track_point where id = ?;")) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                return loadTrackPoints(rs);
            }
        }
    }

    private List<TrackPoint> loadTrackPoints(ResultSet rs) throws SQLException {
        List<TrackPoint> trackpoints = new ArrayList<>();
        while (rs.next()) {
            trackpoints.add(extractTrackPoint(rs));
        }
        return trackpoints;
    }

    private TrackPoint extractTrackPoint(ResultSet rs) throws SQLException {
        LocalDate time = rs.getDate("tp_time").toLocalDate();
        double lat = rs.getDouble("lat");
        double lon = rs.getDouble("lon");

        return new TrackPoint(time, lat, lon);
    }
}