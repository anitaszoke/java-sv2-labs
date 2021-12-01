package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TownTest {

    @Test
    void containsFewerHabitantsTest() {
        List<Integer> people = Arrays.asList(25000, 15000, 600, 8000);
        Town town = new Town();

        assertEquals(true, town.containsFewerHabitants(people, 1000));
        assertTrue(true, String.valueOf(town.containsFewerHabitants(people, 1000)));

    }
}