package activitytracker;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class ActivityRepository {

    private DataSource dataSource;

    public ActivityRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void saveActivity(Activity activity) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values (?, ?, ?);")) {
            setStmtActivity(activity, stmt);

            stmt.executeUpdate();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not save", sqle);
        }
    }

    private void setStmtActivity(Activity activity, PreparedStatement stmt) throws SQLException {

        stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
        stmt.setString(2, activity.getDesc());
        stmt.setString(3, activity.getType().toString());

    }
}