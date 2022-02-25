package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add an integer: ");
        int integer = scanner.nextInt();

        System.out.println("Add another integer: ");
        int integerAnother = scanner.nextInt();

        System.out.println(integer + " + " + integerAnother);
        System.out.println(integer + integerAnother);
    }
}