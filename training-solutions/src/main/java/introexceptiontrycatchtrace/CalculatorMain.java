package introexceptiontrycatchtrace;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adja meg az első számot: ");
        int number1 = 1;
        try {
            number1 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Nem szám");
            System.out.println("Első szám értéke: " + number1);
        }

        System.out.println("Kérem adja meg a második számot: ");
        int number2 = 1;
        try {
            number2 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Nem szám");
            System.out.println("Második szám értéke: " + number2);
        }

        System.out.println("Kérem válasszon egy műveletet!\n"
                + "1. Összeadás\n"
                + "2. Kivonás\n"
                + "3. Szorzás\n"
                + "4. Osztás");
        String operation = scanner.nextLine();

        try {
            switch (operation) {
                case "1":
                    System.out.println(calculator.sum(number1, number2));
                    break;
                case "2":
                    System.out.println(calculator.subtract(number1, number2));
                    break;
                case "3":
                    System.out.println(calculator.multiplication(number1, number2));
                    break;
                case "4":
                    System.out.println(calculator.divide(number1, number2));
                    break;
                default:
                    System.out.println("Hiba a művelet kiválasztásakor");
            }
        } catch (ArithmeticException ae) {
            System.out.println("Hiba: 0-val osztás.");
        }
    }
}