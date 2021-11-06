package controliteration.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg, hány elemet szeretne kiíratni a Fibonacci-sorozatból!");
        int number = scanner.nextInt();
        scanner.nextLine();

        int[] fibonacci = new int[number + 2];
        fibonacci[1] = 1;


        for (int i = 0; i < number; i++) {
            int nextElem = fibonacci[i] + fibonacci[i + 1];
            fibonacci[i + 2] = nextElem;
            System.out.print(fibonacci[i] + ", ");
        }

        System.out.println();

        int i = 0;
        do {

            int nextElem = fibonacci[i] + fibonacci[i + 1];
            nextElem = fibonacci[i + 2];
            System.out.print(fibonacci[i] + ", ");
            i++;
        } while (i < number);

        System.out.println();

        int j = 0;
        while (j < number) {
            int nextElem = fibonacci[j] + fibonacci[j + 1];
            nextElem = fibonacci[j + 2];
            System.out.print(fibonacci[j] + ", ");
            j++;
        }
    }
}

