package interfaceextends.polygon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolygonTest {

    @Test
    void testCreate() {
        Polygon polygon = new Polygon(10, 10);

        assertEquals(10, polygon.getLengthOfSide());
        assertEquals(10, polygon.getNumberOfVertices());
    }

    @Test
    void testGeometricOperations() {
        Polygon polygon = new Polygon(10, 10);

        assertEquals(100, polygon.getPerimeter());
        assertEquals(7, polygon.getNumberOfDiagonalsFromOneVertex());
        assertEquals(35, polygon.getNumberOfAllDiagonals());
    }

}