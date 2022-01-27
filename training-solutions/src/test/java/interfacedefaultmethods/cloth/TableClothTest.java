package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {
    TableCloth tableCloth = new TableCloth(2.2);

    @Test
    void getSideTest() {

        assertEquals(2.2, tableCloth.getSide());
    }

    @Test
    void numberOfSidesTest() {

        assertEquals(4, tableCloth.getNumberOfSides());

    }

    @Test
    void getLengthOfDiagonalTest() {

        assertEquals(3.11, tableCloth.getLengthOfDiagonal(), 0.1);
    }

    @Test
    void getPerimeterTest() {

        assertEquals(8.8, tableCloth.getPerimeter());
    }

    @Test
    void getAreaTest() {

        assertEquals(4.84, tableCloth.getArea(),0.1);
    }

}