package interfaceextends.robots;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void createPointTest() {
        Point point = new Point(1,2,3);

        assertEquals(1L, point.getX());
        assertEquals(2L, point.getY());
        assertEquals(3L, point.getZ());
    }
}