package codewars.kyu5;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/55c04b4cc56a697bb0000048/train/java
// Problem: Scrambles
public class Scrambles {
    
    private Scrambles(){}

    public static Boolean scramble(String str1, String str2) {
    
        Map<Integer, Long> freqMap1 = createFreqMap(str1);
        Map<Integer, Long> freqMap2 = createFreqMap(str2);
        
        for(Entry<Integer, Long> entry : freqMap2.entrySet()){
            Integer map2Key = entry.getKey();
            Long map2Val = entry.getValue();
            if(!freqMap1.containsKey(map2Key)) return false;
            if(freqMap1.get(map2Key) < map2Val) return false;
        }

        return true;
    }

    private static Map<Integer, Long> createFreqMap(String str){

        return str.chars().boxed().collect(
            Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
            )
        );
    }
}
