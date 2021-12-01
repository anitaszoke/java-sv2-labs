package algorithmsfilter.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animalList = new ArrayList<>();

    public Zoo(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public List<Animal> getAnimalsWithNumberOfLegsGiven(int numberOfLegs) {
        List<Animal> filteredAnimal = new ArrayList<>();
        for (Animal a : animalList) {
            if (a.getNumberOfLegs() == numberOfLegs) {
                filteredAnimal.add(a);
            }
        }
        return filteredAnimal;
    }
}