package virtualmethod.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    void freeTimeByHumanTest() {
        Human human = new Human("John Doe");
        assertTrue(Objects.equals(human.getDefaultFreeTime(), 4));
    }

    @Test
    void freeTimeByTrainer() {
        Trainer trainer = new Trainer("John Doe", Arrays.asList(new Course("Course1")));

        assertTrue(Objects.equals(trainer.getDefaultFreeTime(),3));
//itt is a trainer osztályban található metódus hívódik meg - tehát nem a statikus típus határozza meg, hanem a DINAMIKUS típus számít
//        vagyis a példánynak az osztálya, futásidőben dől el : DINAMIKUS KÖTÉS
        Human human = new Trainer("John Doe", Arrays.asList(new Course("Course1")));
        assertTrue(Objects.equals(human.getDefaultFreeTime(),3));
    }
}