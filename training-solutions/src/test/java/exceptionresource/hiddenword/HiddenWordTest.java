package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {

    @Test
    void getHiddenWordTest() {
        HiddenWord hiddenWord = new HiddenWord();
        Path path = Path.of("src/test/resources/hiddenword.txt");

        String word = hiddenWord.getHiddenWord(path);

        assertEquals("ALMA KÖRTE", word);
    }
}