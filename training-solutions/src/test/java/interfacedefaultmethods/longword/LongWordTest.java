package interfacedefaultmethods.longword;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {

    @Test
    void longWordTest() {
        LongWord longWord = new LongWord(Paths.get("src/test/resources/longword.txt"));

        longWord.getLongWord();

        assertEquals("LONGWORD", longWord.getLongWord());
    }
}