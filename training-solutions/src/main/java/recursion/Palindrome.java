package recursion;

public class Palindrome {

    public boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return isPalindrome(word.substring(1, word.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        String word = "akarka";

        System.out.println(new Palindrome().isPalindrome(word));
    }
}