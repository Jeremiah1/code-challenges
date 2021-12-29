package codewars.kyu6;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java
// Problem: Find The Parity Outlier
public class FindOutlier {
    
    private FindOutlier(){}

    public static int find(int[] integers){

        Map<Integer, List<Integer>> map = Map.of(
            0, new LinkedList<>(),
            1, new LinkedList<>()
        );

        for(Integer i : integers){
            map.get(Math.abs(i % 2)).add(i);
        }

        List<Integer> evens = map.get(0);
        List<Integer> odds = map.get(1);

        return (evens.size() == 1) ? evens.get(0) : odds.get(0);
    }
}
