package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void containsLongerWordTest(){
        List<String> words = Arrays.asList("katona","kutya","kelkáposzta");
        Word word = new Word();

        assertEquals(true, word.containsLongerWord(words,"kalap"));
        assertFalse(word.containsLongerWord(words,"elkelkáposzta"));
        assertTrue(word.containsLongerWord(words,"kell"));
    }

}