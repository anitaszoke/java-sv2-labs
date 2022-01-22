package lambda;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemainderTest {
    Remainder remainder = new Remainder();

    @Test
    void changeNUmberToRemainderTest() {

        List<Integer> numbers = Arrays.asList(45, 13, 64, 51, 92, 33);

        assertEquals(Arrays.asList(0, 1, 1, 0, 2, 0), remainder.changeNumberToRemainders(numbers, 3));
    }

}