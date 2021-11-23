package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adjon meg egy maximum öt betűből álló szót: ");
        String word = scanner.nextLine();
        if (word.length() > 5) {
            throw new IllegalArgumentException("Túl hosszú");
        }
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new IllegalArgumentException("Nem csak betűket tartalmaz");
            }
        }
        System.out.println("A megadott szó: " + word);

    }
}

