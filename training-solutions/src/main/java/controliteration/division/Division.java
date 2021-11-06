package controliteration.division;

import java.util.Scanner;

public class Division {

    public void divisionNumbersFor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int divNumber = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= number; i++) {
            if (i % divNumber == 0) {
                System.out.print(i + ", ");
                i++;
            }
        }
    }

    public void divisionNumbersWhile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int divNumber = scanner.nextInt();
        scanner.nextLine();
        int count = 1;
        while (count <= number) {
            if (count % divNumber == 0)
                System.out.print(count + ", ");
            count++;
        }
    }

    public static void main(String[] args) {
        Division division = new Division();

        division.divisionNumbersFor();
        System.out.println();

        division.divisionNumbersWhile();
    }
}