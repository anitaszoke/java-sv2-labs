package stringbuilder.palindrome;

public class PalindromeValidator {

    public boolean isPalindrome(String word) {
        word = word.toLowerCase();
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        return word.equals(sb.toString());

    }

    public static void main(String[] args) {
        PalindromeValidator palindromeValidator = new PalindromeValidator();
        System.out.println(palindromeValidator.isPalindrome("keretkarakterek"));
        System.out.println(palindromeValidator.isPalindrome("keretkarakter"));
    }
}
