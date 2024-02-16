package leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

// https://leetcode.com/problems/valid-parentheses/description/
// Problem 20: Valid Parenthesis
public class ValidParenthesis20 {

    private ValidParenthesis20(){}

    private static final Map<Character, Character> pairs = Map.of(
            ']', '[',
            '}', '{',
            ')', '('
    );

    public static boolean isValid(String s) {

        if(s.length() % 2 != 0) return false;

        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(pairs.get(c) != null){
                if(!pairs.get(c).equals(stack.peek())) return false;
                stack.pop();
                continue;
            }

            stack.push(c);
        }

        return stack.isEmpty();
    }
}
