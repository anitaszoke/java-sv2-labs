package introexceptiontrace.aquarium;

public class AquariumMain {
    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium();

        Fish fish1 = new Fish("ponty", "szürke");
        Fish fish2 = new Fish("bohóchal", "sárga-fehér");

        aquarium.addFish(fish1);
        aquarium.addFish(fish2);

        System.out.println(aquarium.getNumberOfFish());
        //Fish lista értéke null

    }
}
