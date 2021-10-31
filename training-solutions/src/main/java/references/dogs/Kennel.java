package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();

        Dog dogOne = new Dog("Alma",1,"fekete");
        Dog dogTwo = new Dog("Málna",1,"fekete");
        Dog dogThree = new Dog("Bodza",4,"fekete-barna");

        dogs.add(dogOne);
        dogs.add(dogTwo);
        dogs.add(dogThree);

        System.out.println(dogs);

        Dog dogFour = dogs.get(1);
        dogFour.setColour("fehér");

        System.out.println(dogs);

        Dog dogFive = new Dog("Bogár",10,"barna");
        System.out.println(dogFive);

        dogFive = dogs.get(1);
        System.out.println(dogFive);

        dogs.add(dogFive);
        System.out.println(dogs);

        Dog dogSix = dogFour;
        dogSix.setColour("golden");
        System.out.println(dogSix);

        List<Dog> dogsNew = dogs;

        Dog dogSeven = dogFour;
        dogSeven.setColour("foltos");
        System.out.println(dogsNew);

        dogTwo.setColour("pöttyös");
        System.out.println(dogsNew);

        dogTwo = null;
        System.out.println(dogsNew);

        Dog dogEight = dogs.get(1);
        dogEight = null;
        System.out.println(dogsNew);

        Dog dogNine = dogs.get(1);
        dogNine.setColour("sárga");
        System.out.println(dogsNew);
    }
}
