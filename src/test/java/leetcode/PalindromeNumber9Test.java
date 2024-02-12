package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PalindromeNumber9Test {

    @Test
    void givenNegativeNumber_thenReturnFalse() {

        int given = -151;
        boolean result = PalindromeNumber9.isPalindrome(given);
        assertThat(result).isFalse();
    }

    @Test
    void givenOneDigit_thenReturnTrue() {

        int given = 0;
        boolean result = PalindromeNumber9.isPalindrome(given);
        assertThat(result).isTrue();

        given = 9;
        result = PalindromeNumber9.isPalindrome(given);
        assertThat(result).isTrue();
    }

    @Test
    void givenPalindromeNumber_thenReturnTrue() {

        int given = 12321;
        boolean result = PalindromeNumber9.isPalindrome(given);
        assertThat(result).isTrue();

        given = 55;
        result = PalindromeNumber9.isPalindrome(given);
        assertThat(result).isTrue();

        given = 1221;
        result = PalindromeNumber9.isPalindrome(given);
        assertThat(result).isTrue();
    }

    @Test
    void givenNonPalindromeNumber_thenReturnFalse() {

        int given = 40;
        boolean result = PalindromeNumber9.isPalindrome(given);
        assertThat(result).isFalse();

        given = 74;
        result = PalindromeNumber9.isPalindrome(given);
        assertThat(result).isFalse();

        given = 234876;
        result = PalindromeNumber9.isPalindrome(given);
        assertThat(result).isFalse();
    }
}