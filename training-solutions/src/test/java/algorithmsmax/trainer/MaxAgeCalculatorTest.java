package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxAgeCalculatorTest {

    @Test
    void getTrainerWithMaxAge() {
        List<Trainer> trainerList = new ArrayList<>();
        trainerList.add(new Trainer("Pál", 59));
        trainerList.add(new Trainer("Gergő", 70));
        trainerList.add(new Trainer("Sándor", 35));
        MaxAgeCalculator maxAgeCalculator = new MaxAgeCalculator();

        assertEquals(70, maxAgeCalculator.getTrainerWithMaxAge(trainerList).getAge());
        assertEquals("Gergő", maxAgeCalculator.getTrainerWithMaxAge(trainerList).getName());
    }
}