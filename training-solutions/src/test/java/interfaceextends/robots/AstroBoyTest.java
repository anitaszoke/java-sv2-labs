package interfaceextends.robots;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AstroBoyTest {

    @Test
    void moveToTest() {
        Point start = new Point(0, 0, 0);
        AstroBoy astroBoy = new AstroBoy(start);
        Point end = new Point(5, 10, 0);

        astroBoy.moveTo(end);

        assertEquals(end, astroBoy.getPosition());
    }

    @Test
    void fastMoveToTest() {
        Point start = new Point(0, 0, 0);
        AstroBoy astroBoy = new AstroBoy(start);
        Point end = new Point(5, 10, 0);

        astroBoy.fastMoveTo(end);

        //assertEquals(end,astroBoy.getPosition());
        assertEquals(end.getX(), astroBoy.getPosition().getX());
        assertEquals(end.getY(), astroBoy.getPosition().getY());
        assertEquals(end.getZ(), astroBoy.getPosition().getZ());
    }

    @Test
    void rotateTest() {
        Point start = new Point(0, 0, 0);
        AstroBoy astroBoy = new AstroBoy(start);

        astroBoy.rotate(10);

        assertEquals(10, astroBoy.getAngle());
    }

    @Test
    void liftTOTest() {
        Point start = new Point(0, 0, 0);
        AstroBoy astroBoy = new AstroBoy(start);

        astroBoy.liftTo(10);

        assertEquals(10, astroBoy.getAltitude());
    }
}