package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public void addWord(String word) {
        words.add(word);
    }

    public void getWordStartWith(String prefix) {
        List<String> remove = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if (!words.get(i).startsWith(prefix)) {
                remove.add(words.get(i));
            }
        }
        words.removeAll(remove);
    }

    public void getWordsWithLength(int length) {
        List<String> remove = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() != length) {
                remove.add(words.get(i));
            }
        }
        words.removeAll(remove);
    }
}