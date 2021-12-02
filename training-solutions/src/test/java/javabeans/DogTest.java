package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void setGetNameTest() {
        String name = "Alma";
        Dog dog = new Dog();
        dog.setName(name);

        assertEquals(name, dog.getName());
    }

    @Test
    void setGetAgeTest() {
        int age = 1;
        Dog dog = new Dog();
        dog.setAge(age);

        assertEquals(age, dog.getAge());
    }

    @Test
    void setPedigree() {
        Dog dog = new Dog();
        dog.setPedigree(true);

        assertTrue(dog.isPedigree());
    }

    @Test
    void setGetWeight() {
        double weight = 35.4;
        Dog dog = new Dog();
        dog.setWeight(weight);

        assertEquals(weight, dog.getWeight());
    }
}