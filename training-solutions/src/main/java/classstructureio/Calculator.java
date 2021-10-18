package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Add an integer: ");
        Scanner scanner = new Scanner (System.in);
        int integer = scanner.nextInt();

        System.out.println("Add another integer: ");
        Scanner scannerAnother = new Scanner (System.in);
        int integerAnother = scanner.nextInt();

        System.out.println(integer+" + "+integerAnother);
        System.out.println(integer+integerAnother);
    }
}
