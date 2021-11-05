package junit5assert;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumbersTest {
    @Test
    void testGetEvenNumbers(){
        Numbers numbers = new Numbers();
        int [] list = new int[] {2, 8, 5, 6, 2, 3, 9};
        int [] listExp = new int[] {2, 8, 0, 6, 2, 0, 0};

        assertArrayEquals(listExp,numbers.getEvenNumbers(list));
    }
}
