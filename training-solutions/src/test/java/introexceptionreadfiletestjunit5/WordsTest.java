package introexceptionreadfiletestjunit5;


import org.junit.jupiter.api.Test;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WordsTest {

    private Words words = new Words();

    @Test
    public void testGetFirstWordWithA() {
        Path path = Paths.get("src/test/java/words.txt");
        String firstWordWithA = words.getFirstWordWithA(path);

        assertEquals("Anna", firstWordWithA);
    }

    @Test
    public void testGetFirstWordWithANoSuchWord() {
        Path path = Paths.get("src/test/java/wordsnew.txt");
        String firstWordWithA = words.getFirstWordWithA(path);

        assertEquals("A", firstWordWithA);
    }
}
