package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {

    @Test
    void getFirstTwoLettersTest() {
        TwoLetters t = new TwoLetters();
        List<String> words = Arrays.asList("kutya", "macska", "hörcsög");

        assertEquals("ku", t.getFirstTwoLetters(words).get(0));
        assertEquals(3,t.getFirstTwoLetters(words).size());
    }
}