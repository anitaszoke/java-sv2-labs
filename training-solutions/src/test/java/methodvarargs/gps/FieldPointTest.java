package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FieldPointTest {

    @Test
    void createFieldPoint() {
        FieldPoint f = new FieldPoint(LocalDateTime.of(2021, 12, 4, 10, 10), 48.211102, 22.240848);

        assertEquals(LocalDateTime.of(2021, 12, 4, 10, 10), f.getTimeOfSetting());
        assertEquals(48.211102, f.getLatitude());
        assertEquals(22.240848, f.getLongitude());
    }
}