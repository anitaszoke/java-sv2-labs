package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy számot: ");
        int number = scanner.nextInt();
        boolean three = number % 3 == 0;
        System.out.println("Oszható hárommal: " + three);

    }
}
