package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a kezdő számot:");
        int startNumber = scanner.nextInt();
        scanner.nextLine();

        int illegalNumber = 7;
        for (int i = startNumber; i < 20; i++) {
            if (i % 7 == 0) {
                System.out.println("x");
                continue;
            }

            if (String.valueOf(i).contains("7")) {
                break;
            }
            System.out.println(i);
        }
    }
}
