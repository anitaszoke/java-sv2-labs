package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindromeTest() {
        assertTrue(new Palindrome().isPalindrome("arra"));
        assertFalse(new Palindrome().isPalindrome("lahilwh"));
    }
}