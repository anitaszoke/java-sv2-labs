package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Az első időpont óra:");
        int hour = scanner.nextInt();
        System.out.println("Az első időpont pers:");
        int min = scanner.nextInt();
        System.out.println("Az első időpont másodperc:");
        int sec = scanner.nextInt();

        Time time = new Time(hour,min,sec);

        System.out.println("Az második időpont óra:");
        int hourNext = scanner.nextInt();
        System.out.println("Az második időpont perc:");
        int minNext = scanner.nextInt();
        System.out.println("Az második időpont másodperc:");
        int secNext = scanner.nextInt();

        Time timeNext = new Time(hourNext,minNext,secNext);

        System.out.println("Az első időpont: " + time.toString() +" = "+ time.getInMinutes()+" perc");
        System.out.println("A második időpont: " + timeNext.toString() +" = "+ timeNext.getInSeconds()+" másodperc");
        System.out.println("Az első korábbi, mint a második: " + time.earlierThan(timeNext));






    }
}
