package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    NumbersSum ns = new NumbersSum();

    @Test
    void getSumIntTest() {
        assertEquals(24, ns.getSum(new int[]{10, 5, -1, 10}));
    }

    @Test
    void getSumIntNullTest() {
        int[] numbers = null;
        Exception ex = assertThrows(IllegalArgumentException.class, () -> ns.getSum(numbers));
        assertEquals("Can't be null!", ex.getMessage());
    }

    @Test
    void getSumStringTest() {
        assertEquals(24, ns.getSum(new String[]{"10", "5", "-1", "10"}));
    }

    @Test
    void getSumStringNullTest() {
        String[] numbers = null;
        Exception ex = assertThrows(IllegalArgumentException.class, () -> ns.getSum(numbers));
        assertEquals("Can't be null!", ex.getMessage());
    }

    @Test
    void getSumStringWrongInputTest() {
        String[] numbers = new String[]{"10", "c", "-1", "10"};
        Exception ex = assertThrows(IllegalArgumentException.class, () -> ns.getSum(numbers));
        assertEquals("Invalid number", ex.getMessage());
    }
}