package leetcode;

// https://leetcode.com/problems/length-of-last-word/description/
// Problem 58: Length Of Last Word
public class LengthOfLastWord58 {

    private LengthOfLastWord58(){}

    public static int lengthOfLastWord(String input) {

        if(input.isBlank()) return 0;

        String[] tokens = input.split("\\s+");

        String lastWord = tokens[tokens.length - 1];

        return lastWord.length();
    }
}
