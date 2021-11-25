package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectricityTest {

    Electricity electricity = new Electricity();

    @TempDir
    File temporaryFolder;

    @Test
    public void addStreetsTest() throws IOException {
        Path path = temporaryFolder.toPath().resolve("streets.txt");
        electricity.writeStreets(path);
        List<String> expected;
        expected = Files.readAllLines(path);

        assertEquals(5, expected.size());
        assertEquals("Derék utca", expected.get(2));
    }
}
