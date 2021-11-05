package stringbasic.characters;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Words {

    public void wordLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy szót");
        String word = scanner.nextLine();
        System.out.println("Kérem betűzze le a következő szót: " + word);

        char[] letterList = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            String letter = scanner.nextLine();
            letterList[i] = letter.toCharArray()[0];
        }
        System.out.println("A megadott szó: " + word);
        String letterToLetter = Arrays.toString(letterList);
        System.out.println("A betűk: " + letterToLetter);
        String letterToWord = String.valueOf(letterList);
        System.out.println("A betűzött szó: " + letterToWord);

        if (word.equals(letterToWord)) {
            System.out.println("Helyes a megoldás");
        } else {
            System.out.println("Helytelen a megoldás");
        }
    }

    public static void main(String[] args) {
        Words words = new Words();
        words.wordLetter();
    }
}
