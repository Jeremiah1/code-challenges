package codewars.kyu5;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

// https://www.codewars.com/kata/550f22f4d758534c1100025a/train/java
// Problem: Directions Reduction
public class DirectionReduction {
    
    private DirectionReduction(){}

    public static String[] dirReduc(String[] directions) {

        Map<String, String> pairs = Map.of(
            "NORTH", "SOUTH",
            "SOUTH", "NORTH",
            "EAST", "WEST",
            "WEST", "EAST"
        );

        Deque<String> stack = new LinkedList<>();
        
        for(String direction : directions){
            if(pairs.get(direction).equals(stack.peek())){
                stack.pop();
            }
            else{
                stack.push(direction);
            }
        }

        Collections.reverse((LinkedList<String>)stack);
        return stack.toArray(new String[]{});
    }
}
