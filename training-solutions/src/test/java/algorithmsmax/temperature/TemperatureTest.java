package algorithmsmax.temperature;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TemperatureTest {

    Temperature temperature = new Temperature();
    List<Integer> temperatures = Arrays.asList(9,5,8,12,3,27);

    @Test
    void getMinTest() {
        assertNotEquals(6,temperature.getMin(temperatures));
        assertEquals(3,temperature.getMin(temperatures));
    }
}
