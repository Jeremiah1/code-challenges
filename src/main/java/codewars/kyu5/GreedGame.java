package codewars.kyu5;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/5270d0d18625160ada0000e4/train/java
// Problem: Greed is Good
public class GreedGame {

    private GreedGame(){}

    public static Integer greedy(int[] dice){

        int maxScore = 0;

        Map<Integer, Long> freqMap = Arrays.stream(dice).boxed().collect(
            Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
            )
        );

        for(int i = 1; i < 7; i++){
            
            Long occurrences = freqMap.getOrDefault(i, 0L);
            maxScore +=  (i * (occurrences/3) * (i == 1 ? 1000 : 100));
            maxScore += (i == 1) ? (occurrences % 3) * 100 : 0; 
            maxScore += (i == 5) ? (occurrences % 3) * 50 : 0;
        }

        return maxScore;
    }
}
