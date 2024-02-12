package leetcode;

// https://leetcode.com/problems/palindrome-number/description/
// Problem 9: Palindrome Number
public class PalindromeNumber9 {

    private PalindromeNumber9(){}

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        StringBuilder number = new StringBuilder(String.valueOf(x));
        number.reverse();

        return number.toString().equals(String.valueOf(x));
    }
}
