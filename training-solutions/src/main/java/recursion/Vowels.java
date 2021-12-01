package recursion;

public class Vowels {
    private String vowels = "aeuio";

    public int getNumberOfVowels(String word) {
        word = word.toLowerCase();
        if (word.length() == 0) {
            return 0;
        }
        if (vowels.indexOf(word.charAt(0)) >= 0) {
            return 1 + getNumberOfVowels(word.substring(1));
        } else {
            return getNumberOfVowels(word.substring(1));
        }
    }
}