package interfaceextends.robots;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C3POTest {

    @Test
    void moveToTest() {
        Point start = new Point(0, 0, 0);
        C3PO c3PO = new C3PO(start);

        Point end = new Point(5, 10, 0);

        c3PO.moveTo(end);

        assertEquals(end, c3PO.getPosition());
    }

    @Test
    void fastMoveTo() {

        Point start = new Point(0, 0, 0);
        C3PO c3PO = new C3PO(start);

        Point end = new Point(5, 10, 0);

        c3PO.fastMoveTo(end);

        assertEquals(end, c3PO.getPosition());

    }

    @Test
    void rotateTest() {
        Point start = new Point(0, 0, 0);
        C3PO c3PO = new C3PO(start);
        final int angle = 10;

        c3PO.rotate(angle);

        assertEquals(angle, c3PO.getAngle());
    }
}