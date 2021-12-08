package introinheritance.fruit;

public class FruitMain {

    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        fruit.setName("Berry");
        fruit.setWeight(0.1);
        System.out.println(fruit.getName());
        System.out.println(fruit.getWeight());
        System.out.println();

        Grape grape = new Grape();
        grape.setName("White");
        grape.setWeight(0.2);
        grape.setType("Wine");
        System.out.println(grape.getName());
        System.out.println(grape.getWeight());
        System.out.println(grape.getType());
        System.out.println();

        Apple apple = new Apple();
        apple.setName("Idared");
        apple.setWeight(0.3);
        apple.setPieces(2);
        System.out.println(apple.getName());
        System.out.println(apple.getWeight());
        System.out.println(apple.getPieces());
        System.out.println();

        GoldenDelicious goldenDelicious = new GoldenDelicious();
        goldenDelicious.setName("Golden");
        goldenDelicious.setWeight(0.4);
        goldenDelicious.setPieces(5);
        System.out.println(goldenDelicious.getName());
        System.out.println(goldenDelicious.getWeight());
        System.out.println(goldenDelicious.getPieces());
        System.out.println(goldenDelicious.getColour());
        System.out.println();

        Starking starking = new Starking();
        starking.setName("Starking");
        starking.setWeight(0.5);
        starking.setPieces(4);
        System.out.println(starking.getName());
        System.out.println(starking.getWeight());
        System.out.println(starking.getPieces());
        System.out.println(starking.getColour());
        System.out.println();
    }
}