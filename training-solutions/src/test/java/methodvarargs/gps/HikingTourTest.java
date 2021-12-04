package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HikingTourTest {

    HikingTour hikingTour = new HikingTour();
    FieldPoint f1 = new FieldPoint(LocalDateTime.of(2021, 12, 4, 10, 10), 48.211102, 22.240848);
    FieldPoint f2 = new FieldPoint(LocalDateTime.of(2021, 12, 4, 11, 10), 47.211102, 23.240848);
    FieldPoint f3 = new FieldPoint(LocalDateTime.of(2021, 12, 4, 12, 10), 49.211102, 24.240848);


    @Test
    void addFieldPointTest() {

    }

    @Test
    void logFieldPointTest() {
        hikingTour.logFieldPoint(LocalDateTime.of(2021, 12, 4, 13, 50), f1, f2, f3);

        assertEquals(47.211102, hikingTour.addFieldPoint().get(1).getLatitude());
        assertEquals(3, hikingTour.addFieldPoint().size());
    }

    @Test
    void logFieldPointNullTest() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> hikingTour.logFieldPoint(null, f1, f2, f3));

        assertEquals("Time of logging can not null!", ex.getMessage());
    }
}