package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ElectricityTest {
    private Electricity electricity = new Electricity();

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testWriteStreets() throws IOException {
        Path path = temporaryFolder.newFile("streetNames.txt").toPath();
        electricity.writeStreets(path);
        List<String> expected = Files.readAllLines(path);

        assertEquals(5, expected.size());
        assertEquals("Derék utca", expected.get(2));
    }

}
