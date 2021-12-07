package staticattrmeth.dog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetTest {

    @Test
    void addDog() {
        Dog dog1 = new Dog("Málna", 1, Species.GOLDEN_RETRIEVER);
        Dog dog2 = new Dog("Alma", 1, Species.GERMAN_SHEPHERD);
        Dog dog3 = new Dog("Bodza", 4, Species.GERMAN_SHEPHERD);
        Vet vet = new Vet();

        vet.addDog(dog1);
        vet.addDog(dog2);
        vet.addDog(dog3);

        assertEquals(3, vet.getDogs().get(2).getCodeNumber());
        assertEquals(1, vet.getDogs().get(0).getCodeNumber());
    }
}