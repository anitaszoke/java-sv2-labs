package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void getSumTest() {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        assertEquals(550, new Numbers().getSum(numbers));
    }
}