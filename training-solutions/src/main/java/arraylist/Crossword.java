package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Crossword {
    public static void main(String[] args) {
        List<String> word = new ArrayList<>();

        word.add("KULCS");
        word.add("KÁLYHA");
        word.add("LÓ");
        word.add("AJTÓ");
        word.add("CSERESZNYEFA");
        word.add("TEJ");
        word.add("FELHŐ");
        word.add("CIPŐ");
        word.add("MOSODA");
        word.add("KÁVÉTEJSZÍN");
        word.add("CITERA");
        word.add("BABA");

        for (String item : word) {
            if (item.length() == 6) {
                System.out.println(item);
            }
        }
    }
}
