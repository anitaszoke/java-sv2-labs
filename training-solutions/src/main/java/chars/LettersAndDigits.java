package chars;

import java.util.List;

public class LettersAndDigits {

    public void printLetterOrDigit(String text) {
        char[] letters = text.toCharArray();
        for (char l : letters) {
            if (Character.isAlphabetic(l)) {
                System.out.println(l + ": betű");
            }
            else if (Character.isDigit(l)) {
                System.out.println(l + " : számjegy");
            } else {
                System.out.println(l + ": egyéb");
            }
        }
    }


    public static void main(String[] args) {
        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        lettersAndDigits.printLetterOrDigit("8547/*-+lkjh");

    }
}