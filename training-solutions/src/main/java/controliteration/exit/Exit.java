package controliteration.exit;

import java.util.Scanner;

public class Exit {

    public void exitX() {
        String x = "x";
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Az ügyfélszolgálat menüje jelenleg nem elérhető. Kilépés: 'x' billentyű megnyomásával.");
            answer = scanner.nextLine();
            answer = answer.toLowerCase();
        } while (!x.equals(answer));
    }

    public static void main(String[] args) {
        Exit exit = new Exit();
        exit.exitX();
    }
}


