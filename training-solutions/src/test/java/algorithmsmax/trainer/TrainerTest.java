package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {

    @Test
    void createTrainerTest() {
        Trainer trainer = new Trainer("Pál", 59);

        assertEquals("Pál", trainer.getName());
        assertEquals(59, trainer.getAge());
    }
}