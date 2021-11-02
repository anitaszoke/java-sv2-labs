package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {
    private List<Integer> numberList = new ArrayList<>();

    public List<Integer> getNumber() {
        return numberList;
    }

    public void addDigitsToList(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                String numberInText = Character.toString(c);
                int number = Integer.parseInt(numberInText);
                numberList.add(number);
            }
        }
    }

    public static void main(String[] args) {
        Digits digits = new Digits();
        digits.addDigitsToList("1a2s3d4f5g6h7j8k9l");
        System.out.println(digits.getNumber());
    }
}

