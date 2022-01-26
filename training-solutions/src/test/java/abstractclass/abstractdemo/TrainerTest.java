package abstractclass.abstractdemo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    void createHumanTrainerTest() {
        Human human = new Trainer("John Doe", 30, Arrays.asList(new Course("Course1")));
        human.work();

        assertEquals(30,human.getAge());

    }

    @Test
    void createTrainerTrainerTest() {
        Trainer trainer = new Trainer("John Doe", 30, Arrays.asList(new Course("Course1")));
        trainer.work();

        assertEquals(30,trainer.getAge());

    }
}

