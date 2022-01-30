package exceptions.measurement;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {
    Path path = Paths.get("src/test/resources/measurementdata.csv");
    Measurement measurement = new Measurement();

    @Test
    void readFileTest() {
        List<String> measurements = measurement.readFromFile(path);

        assertEquals(11, measurements.size());
    }

    @Test
    void readFileWrongPathTest() {
        Exception ex = assertThrows(IllegalStateException.class,
                () -> measurement.readFromFile(Paths.get("src/test/resources/measurementdatas.csv")));
        assertEquals("File not found", ex.getMessage());

    }

    @Test
    void validateTest() {
        List<String> wrongLines = measurement.validate(measurement.readFromFile(path));

        assertEquals(8,wrongLines.size());
    }

}