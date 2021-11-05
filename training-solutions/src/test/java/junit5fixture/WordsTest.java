package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {
    Words words;

    @BeforeEach
    void setUp() {
        words = new Words();
        words.addWord("alma");
        words.addWord("málna");
        words.addWord("körte");
        words.addWord("ananász");
        words.addWord("ajtó");
    }

    @Test
    void testGetWordsStartWith() {
        List<String> startWith = Arrays.asList("alma", "ananász", "ajtó");
        words.getWordStartWith("a");
        assertEquals(startWith, words.getWords());
    }

    @Test
    void testGetWordsWithLength() {
        List<String> withLength = Arrays.asList("alma", "ajtó");
        words.getWordsWithLength(4);
        assertEquals(withLength, words.getWords());
    }
}
