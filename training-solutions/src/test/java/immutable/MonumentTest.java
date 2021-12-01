package immutable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MonumentTest {

    @Test
    void createMonument() {
        Monument m = new Monument("Table", "Vác", LocalDate.of(1958, 12, 20), "54698-XY");
        assertEquals("Table", m.getName());
        assertEquals("Vác", m.getTitle());
        assertEquals(LocalDate.of(1958, 12, 20), m.getDate());
        assertEquals("54698-XY", m.getNumber());
    }

    @Test
    void createMonumentNameEmptyNull() {
        Exception thrownEmpty = Assertions.assertThrows(IllegalArgumentException.class, () -> new Monument("", "Vác", LocalDate.of(1958, 12, 20), "54698-XY"));
        Exception thrownNull = Assertions.assertThrows(IllegalArgumentException.class, () -> new Monument(null, "Vác", LocalDate.of(1958, 12, 20), "54698-XY"));

        assertEquals("Data can not be empty or null!", thrownEmpty.getMessage());
        assertEquals("Data can not be empty or null!", thrownNull.getMessage());
    }

    @Test
    void createMonumentTitleEmptyNull() {
        Exception thrownEmpty = Assertions.assertThrows(IllegalArgumentException.class, () -> new Monument("Table", "", LocalDate.of(1958, 12, 20), "54698-XY"));
        Exception thrownNull = Assertions.assertThrows(IllegalArgumentException.class, () -> new Monument("Table", null, LocalDate.of(1958, 12, 20), "54698-XY"));

        assertEquals("Data can not be empty or null!", thrownEmpty.getMessage());
        assertEquals("Data can not be empty or null!", thrownNull.getMessage());
    }

    @Test
    void createMonumentNumbersEmptyNull() {
        Exception thrownEmpty = Assertions.assertThrows(IllegalArgumentException.class, () -> new Monument("Table", "Vác", LocalDate.of(1958, 12, 20), ""));
        Exception thrownNull = Assertions.assertThrows(IllegalArgumentException.class, () -> new Monument("Table", "Vác", LocalDate.of(1958, 12, 20), null));

        assertEquals("Data can not be empty or null!", thrownEmpty.getMessage());
        assertEquals("Data can not be empty or null!", thrownNull.getMessage());
    }
}