package algorithmsdecision.words;

import java.util.List;

public class Word {
    public boolean containsLongerWord(List<String> words, String newWord) {
        int newWordLenght = newWord.length();
        for (String s : words) {
            if (s.length() > newWordLenght) {
                return true;
            }
        }
        return false;
    }
}