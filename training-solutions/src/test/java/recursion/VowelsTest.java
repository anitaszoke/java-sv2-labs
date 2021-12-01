package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    @Test
    void getNumberOfVowelsTest() {
        assertEquals(2,new Vowels().getNumberOfVowels("five"));
    }
}