package introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    public int dataForCalculateOne() {
        System.out.println("Kérem adja meg az első számot: ");
        int number1 = 1;
        try {
            number1 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Nem szám");
            System.out.println("Első szám értéke: " + number1);
        }
        return number1;
    }

    public int dataForCalculateTwo() {
        System.out.println("Kérem adja meg a második számot: ");
        int number2 = 1;
        try {
            number2 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Nem szám");
            System.out.println("Második szám értéke: " + number2);
        }
        return number2;
    }

    public String calculateOperationPrint() {
        System.out.println("Kérem válasszon egy műveletet!\n"
                + "1. Összeadás\n"
                + "2. Kivonás\n"
                + "3. Szorzás\n"
                + "4. Osztás");
        String operation = scanner.nextLine();
        return operation;
    }

    public void Calculate() {
        try {
            switch (calculateOperationPrint()) {
                case "1":
                    System.out.println(dataForCalculateOne() + dataForCalculateTwo());
                    break;
                case "2":
                    System.out.println(dataForCalculateOne() - dataForCalculateTwo());
                    break;
                case "3":
                    System.out.println(dataForCalculateOne() * dataForCalculateTwo());
                    break;
                case "4":
                    System.out.println(dataForCalculateOne() / dataForCalculateTwo());
                    break;
                default:
                    System.out.println("Hiba a művelet kiválasztásakor");
            }
        } catch (ArithmeticException ae) {
            System.out.println("Hiba: 0-val osztás.");
        }
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.Calculate();
    }
}
