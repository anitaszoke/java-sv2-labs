package staticattrmeth.dog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void createDog() {
        Dog dog = new Dog("Málna", 1, Species.GOLDEN_RETRIEVER);

        assertEquals("Málna", dog.getName());
        assertEquals(1, dog.getAge());
        assertEquals(Species.GOLDEN_RETRIEVER, dog.getBreed());
        assertEquals(0,dog.getCodeNumber());
    }
}