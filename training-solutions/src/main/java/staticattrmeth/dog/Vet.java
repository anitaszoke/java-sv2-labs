package staticattrmeth.dog;

import java.util.ArrayList;
import java.util.List;

public class Vet {
    List<Dog> dogs = new ArrayList<>();
    private static long code = 1;

    public List<Dog> getDogs() {
        return dogs;
    }

    public List<Dog> addDog(Dog dog) {
        dog.setCodeNumber(codeSet(dog));
        dogs.add(dog);
        return dogs;
    }

    public static long codeSet(Dog dog) {
        return code++;
    }
}