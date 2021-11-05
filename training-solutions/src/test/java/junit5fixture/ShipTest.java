package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {
    Ship ship;

    @BeforeEach
    void initShip() {
        ship = new Ship("Green",2015,4.25);
    }
    @Test
    void testName() {
        assertEquals("Green",ship.getName());
        assertNotEquals("Zöld",ship.getName());
    }
    @Test
    void testYearOfConstruction() {
        assertEquals(2015,ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction() == 2015);
        assertFalse(ship.getYearOfConstruction() == 2014);
    }
    @Test
    void testLength() {
        assertEquals(4.2,ship.getLength(),0.05);
    }
    @Test
    void testNull() {
        Ship ship1 = null;
        assertNull(ship1);
        assertNotNull(ship);
    }
    @Test
    void testSameObjects() {
        Ship ship2 = ship;
        assertSame(ship, ship2);
    }
    @Test
    void testNotSameObjects() {
        Ship ship3 = new Ship("Green",2015,4.25);
        //assertSame(ship,ship3);
        assertNotSame(ship,ship3);
    }
}
