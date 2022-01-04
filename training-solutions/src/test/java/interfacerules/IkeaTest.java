package interfacerules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IkeaTest {
    @Test
    void testEquator() {
        Equator equator = new Equator();

        assertEquals("Equator", equator.getName());
        assertEquals(10.5, equator.getLength());
    }

    @Test
    void testIkeaFurniture() {
        IkeaFurniture furniture = new IkeaFurniture("Jokkmokk asztal", 108.0, 68.0);

        assertEquals("Jokkmokk asztal", furniture.getName());
        assertEquals(108.0, furniture.getLength());
        assertEquals(68.0, furniture.getWidth());
    }

    @Test
    void testParkingPlace() {
        ParkingPlace parkingPlace = new ParkingPlace();

        assertEquals(2.2, parkingPlace.getLength());
        assertEquals(5.0, parkingPlace.getWidth());
    }
}
