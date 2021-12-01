package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {

    public List<String> getFirstTwoLetters(List<String> words) {
        List<String> twoLettersList = new ArrayList<>();
        for (String s : words) {
            twoLettersList.add(s.substring(0, 2));
        }
        return twoLettersList;
    }
}