package codewars.kyu6;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

// https://www.codewars.com/kata/5277c8a221e209d3f6000b56/train/java
// Problem: Valid Braces
public class BraceChecker {

    private BraceChecker(){}

    private static final Set<Character> CLOSING_BRACES;
    private static final Map<Character, Character> BRACE_PAIRS;
    
    static {
        CLOSING_BRACES = Set.of('}', ']', ')');

        BRACE_PAIRS = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
        );
    }

    public static Boolean isValid(String braces) {

        Deque<Character> bracesStack = new LinkedList<>();

        for(Character brace : braces.toCharArray()){

            if(isClosingBrace(brace)){
                if(bracesStack.isEmpty() || !bracesStack.peek().equals(BRACE_PAIRS.get(brace))){
                    return false;
                }
                bracesStack.pop();
            }
            else{
                bracesStack.push(brace);
            }
        }

        return bracesStack.isEmpty();
    }

    private static boolean isClosingBrace(Character c){
        return CLOSING_BRACES.contains(c);
    }
}
