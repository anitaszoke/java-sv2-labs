package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

    public static void main(String[] args) {
        List<String> favouriteThings = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        Favourites favourites = new Favourites();

        System.out.println("Kedvenc film?");
        String film = scanner.nextLine();
        favouriteThings.add(film);

        System.out.println("Kedvenc állat?");
        String animal = scanner.nextLine();
        favouriteThings.add(animal);

        System.out.println("Kedvenc szín?");
        String color = scanner.nextLine();
        favouriteThings.add(color);

        System.out.println(favouriteThings);
        System.out.println(favouriteThings.size());


    }
}
