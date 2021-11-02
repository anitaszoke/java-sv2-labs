package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem oldja meg a következő feladatot");
        double result = 5 * 5.5 / 5 + 5 - 5;
        System.out.println("5 * 5.5 / 5 + 5 - 5");
        System.out.println("Megoldás: ");
        double answer = scanner.nextDouble();


        if (result == answer || (result - answer) < 0.0001) {
            System.out.println("Helyes");
        } else {
            System.out.println("Helytelen");
        }
    }
}
