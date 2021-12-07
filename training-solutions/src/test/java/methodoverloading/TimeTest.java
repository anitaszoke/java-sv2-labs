package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    @Test
    void timeCreate() {
        Time time = new Time(14, 30, 20);

        assertEquals(14, time.getHours());
        assertEquals(30, time.getMinutes());
        assertEquals(20, time.getSeconds());
    }

    @Test
    void isEqualTest() {
        Time time1 = new Time(14, 30, 20);

        assertTrue(time1.isEqual(14, 30, 20));
        assertFalse(time1.isEqual(15, 30, 20));
    }

    @Test
    void testIsEqual() {
        Time time1 = new Time(14, 30, 20);
        Time time2 = new Time(14, 30, 20);
        Time time3 = new Time(15, 30, 20);

        assertTrue(time1.isEqual(time2));
        assertFalse(time1.isEqual(time3));
    }

    @Test
    void isEarlierTest() {
        Time time2 = new Time(14, 30, 20);
        Time time3 = new Time(15, 30, 20);

        assertFalse(time3.isEarlier(time2));
        assertTrue(time2.isEarlier(time3));
    }

    @Test
    void testIsEarlier() {
        Time time3 = new Time(15, 30, 20);

        assertFalse(time3.isEarlier(16, 45, 20));
        assertTrue(time3.isEarlier(15, 30, 19));
    }
}