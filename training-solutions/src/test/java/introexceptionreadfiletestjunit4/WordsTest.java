package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

public class WordsTest {
    private Words words = new Words();

    @Test
    public void getFirstWordWithATest() {
        Path path = Paths.get("src/test/java/words.txt");
        String firstWordWithA = words.getFirstWordWithA(path);

        assertEquals("Anna", firstWordWithA);
    }

    @Test
    public void getFirstWordWithANoWordTest() {
        Path path = Paths.get("src/test/java/wordsnew.txt");
        String firstWordWithA = words.getFirstWordWithA(path);

        assertEquals("A", firstWordWithA);
    }
}
