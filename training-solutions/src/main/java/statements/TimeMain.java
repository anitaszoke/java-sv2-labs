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






    }
}
