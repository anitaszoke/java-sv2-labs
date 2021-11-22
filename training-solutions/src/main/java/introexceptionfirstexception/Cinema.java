package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vásárló neve: ");
        String name = scanner.nextLine();

        System.out.println("Film címe: ");
        String title = scanner.nextLine();

        System.out.println("Hány fő: ");
        int person = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Hanyadik sor: ");
        int row = scanner.nextInt();
        scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= person; i++) {
            stringBuilder.append(row).append(". sor ").append(i).append(". szék");
            if (i != person) {
                stringBuilder.append(", ");
            }
        }
        String result = stringBuilder.toString();

        System.out.println("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:\n"
                + "Vásárló neve: " + name + "\n"
                + "Film címe: " + title + "\n"
                + "Lefoglalt helyek: " + result + "\n"
                + "Jó szórakozást!");
    }
}
