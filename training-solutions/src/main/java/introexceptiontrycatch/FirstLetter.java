package introexceptiontrycatch;

import java.util.Arrays;
import java.util.List;

public class FirstLetter {
    private List<String> strings = Arrays.asList("alma", "málna", null, "szilva", "barack");

    public void firstLetter(List<String> list) {
        try {
            for (int i = 0; i < strings.size(); i++) {
                System.out.print(strings.get(i).charAt(0) + " ");

            }
        } catch (NullPointerException npe) {
            System.out.println("Nincs érték");
            System.out.println(npe.getMessage());
            npe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FirstLetter firstLetter = new FirstLetter();
        firstLetter.firstLetter(firstLetter.strings);
    }
}
