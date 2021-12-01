package algorithmsfilter.prefix;

import java.util.ArrayList;
import java.util.List;

public class Prefix {
    public List<String> getWordsStartWith(List<String> words, String prefix) {
        List<String> filteredList = new ArrayList<>();
        for (String s : words) {
            if (s.startsWith(prefix)) {
                filteredList.add(s);
            }
        }
        return filteredList;
    }
}