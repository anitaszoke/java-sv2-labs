package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sNumber = scanner.nextLine();
        for (char c : sNumber.toCharArray()) {
            if (Character.isLetter(c)) {
                throw new IllegalArgumentException("Not a number!");
            }
        }
        if (Integer.parseInt(sNumber) < 0) {
            throw new IllegalArgumentException("Not positive!");
        }

        System.out.println(Integer.parseInt(sNumber));
    }
}



