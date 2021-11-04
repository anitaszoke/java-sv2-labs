package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DragonTest {

    @Test
    void testName() {
        Dragon dragon = new Dragon("Süsü", 1, 4.25);
        assertEquals("Süsü",dragon.getName());
        assertNotEquals("Bolyhoska",dragon.getName());
    }
    @Test
    void testNumberOfHeads() {
        Dragon dragon = new Dragon("Süsü", 1 , 4.25);
        assertEquals(1, dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads() == 1);
        assertFalse(dragon.getNumberOfHeads() == 3);
    }
    @Test
    void testHeight() {
        Dragon dragon = new Dragon("Süsü", 1, 4.25);
        assertEquals(4.25,dragon.getHeight(),0.0005);
    }
    @Test
    void testNull() {
        Dragon dragon = new Dragon("Süsü", 1, 4.25);
        Dragon dragon2 = null;
        assertNull(dragon2);
        assertNotNull(dragon);
    }
    @Test
    void testSameObjects() {
        Dragon dragon = new Dragon("Süsü", 1, 4.25);
        Dragon dragon2 = dragon;
        assertSame(dragon,dragon2);
    }
    @Test
    void testNotSameObjects() {
        Dragon dragon = new Dragon("Süsü", 1, 4.25);
        Dragon dragon2 = new Dragon("Süsü", 1, 4.25);

        assertNotSame(dragon, dragon2);
    }

}
