package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void createAnimal() {
        Animal animal = new Animal("Zebra", 4);

        assertEquals("Zebra", animal.getName());
        assertEquals(4, animal.getNumberOfLegs());
    }
}