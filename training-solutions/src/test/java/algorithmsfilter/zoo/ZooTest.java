package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    void addAnimalTest() {
        List<Animal> animalList = new ArrayList<>();
        Zoo zoo = new Zoo(animalList);
        Animal animal = new Animal("Zebra", 4);
        zoo.addAnimal(animal);

        assertEquals(1, animalList.size());

    }

    @Test
    void getAnimalsWithNumberOfLegsGivenTest() {
        List<Animal> animalList = new ArrayList<>();
        Zoo zoo = new Zoo(animalList);
        Animal animal = new Animal("Zebra", 4);
        zoo.addAnimal(animal);
        zoo.addAnimal(new Animal("Kacsa", 2));
        zoo.addAnimal(new Animal("Nyúl", 4));

        List<Animal> filteredAnimal = zoo.getAnimalsWithNumberOfLegsGiven(4);

        assertEquals(2, filteredAnimal.size());
    }
}