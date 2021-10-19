package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();

        System.out.println("Favorite song band?");
        song.band = scanner.nextLine();

        System.out.println("Favorite song title?");
        song.title = scanner.nextLine();

        System.out.println("Favorite song length?");
        song.length = scanner.nextInt();

        System.out.println(song.band + " - " + song.title + " (" + song.length + " perc)");


    }
}
