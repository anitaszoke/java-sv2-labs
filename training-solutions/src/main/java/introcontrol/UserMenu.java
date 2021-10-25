package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {

        System.out.println("Kérem válasszon!");
        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Többi: Kilépés");

        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        if (answer == 1) {
            System.out.println("Felhasználók listázása");
        }
        if (answer == 2) {
            System.out.println("Felhasználók felvétele");
        }
        if (answer > 2 ) {
            System.out.println("Kilépés");

        }
    }

}
