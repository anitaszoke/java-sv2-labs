package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivityRepositoryTest {

    ActivityRepository ar;

    @BeforeEach
    void init() throws SQLException {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
        dataSource.setUser("activitytracker");
        dataSource.setPassword("activitytracker");

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        Activity biking = new Activity(1, LocalDateTime.of(2022, 1, 20, 10, 10), "biking in the forest", Type.BIKING);
        Activity hiking = new Activity(2, LocalDateTime.of(2022, 1, 21, 11, 30), "hiking in the mountain", Type.HIKING);
        Activity running = new Activity(3, LocalDateTime.of(2022, 1, 22, 9, 0), "running in the street", Type.RUNNING);
        Activity basketball = new Activity(4, LocalDateTime.of(2022, 1, 20, 15, 30), "basketball with friends", Type.BASKETBALL);

        ar = new ActivityRepository(dataSource);
        ar.saveActivity(biking);
        ar.saveActivity(hiking);
        ar.saveActivity(running);
        ar.saveActivity(basketball);
    }


    @Test
    void findActivityByIdTest() {
        Activity activity = ar.findActivityById(2);
        assertEquals("hiking in the mountain", activity.getDesc());
    }

    @Test
    void listActivities() {
        List<Activity> activityList = ar.listActivities();

        assertEquals(4, activityList.size());
    }

}