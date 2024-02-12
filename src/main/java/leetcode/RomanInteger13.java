package leetcode;

import static java.util.Map.entry;

import java.util.Map;

// https://leetcode.com/problems/roman-to-integer/description/
// Problem 13: Roman to Integer

// Symbol       Value
//   I            1
//   V            5
//   X            10
//   L            50
//   C            100
//   D            500
//   M            1000
// I can be placed before V (5) and X (10) to make 4 and 9.
// X can be placed before L (50) and C (100) to make 40 and 90.
// C can be placed before D (500) and M (1000) to make 400 and 900.
public class RomanInteger13 {

    private RomanInteger13(){}

    private static final Map<String, Integer> romanNumbers;

    static {
        romanNumbers = Map.ofEntries(
                entry("I", 1),
                entry("V", 5),
                entry("X", 10),
                entry("L", 50),
                entry("C", 100),
                entry("D", 500),
                entry("M", 1000),
                entry("IV", 4),
                entry("IX", 9),
                entry("XL", 40),
                entry("XC", 90),
                entry("CD", 400),
                entry("CM", 900)
        );
    }

    public static int romanToInt(String s) {

        int total = 0;
        int index = 0;
        while (index < s.length()){

            int substringEnd = (index+1 == s.length()) ? 1 : 2;
            String romanSubstring = s.substring(index, index + substringEnd);

            Integer romanValue = romanNumbers.getOrDefault(romanSubstring, 0);
            if (romanValue == 0) {
                String singleRomanNumeral = Character.toString(romanSubstring.charAt(0));
                total += romanNumbers.get(singleRomanNumeral);
            } else{
                total += romanValue;
                index++;
            }
            index++;
        }
        return total;
    }
}
