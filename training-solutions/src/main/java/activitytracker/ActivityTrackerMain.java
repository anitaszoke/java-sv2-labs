package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;

public class ActivityTrackerMain {

    public static void main(String[] args) {

        Activity biking = new Activity(1, LocalDateTime.of(2022, 1, 20, 10, 10), "biking in the forest", Type.BIKING);
        Activity hiking = new Activity(2, LocalDateTime.of(2022, 1, 21, 11, 30), "hiking in the mountain", Type.HIKING);
        Activity running = new Activity(3, LocalDateTime.of(2022, 1, 22, 9, 0), "running in the street", Type.RUNNING);
        Activity basketball = new Activity(4, LocalDateTime.of(2022, 1, 20, 15, 30), "basketball with friends", Type.BASKETBALL);

        MariaDbDataSource dataSource;

        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?userUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot connect database", sqle);
        }

        ActivityRepository ar = new ActivityRepository(dataSource);
        ActivityTrackerMain atm = new ActivityTrackerMain();

/*
        ar.saveActivity(biking);
        ar.saveActivity(hiking);
        ar.saveActivity(running);
        ar.saveActivity(basketball);
*/




    }
}
