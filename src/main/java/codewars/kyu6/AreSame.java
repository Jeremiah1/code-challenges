package codewars.kyu6;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

// https://www.codewars.com/kata/550498447451fbbd7600041c/train/java
// Problem: Are They The "Same"
public class AreSame {

    private AreSame(){}
    
    public static boolean comp(int[] a, int[] b) {

        if(a == null || b == null || a.length != b.length){
            return false;
        }

        long[] aLongs = Arrays.stream(a).mapToLong(i -> i).map(i -> i*i).toArray();
        long[] bLongs = Arrays.stream(b).mapToLong(i -> i).toArray();

        Map<Long, Long> freqMapA = createFreqMap(aLongs);
        Map<Long, Long> freqMapB = createFreqMap(bLongs);

        return freqMapA.equals(freqMapB);
      }

      private static Map<Long, Long> createFreqMap(long[] nums){
          return Arrays.stream(nums).boxed().collect(
            groupingBy(
                Function.identity(),
                counting()
            )
        );
      }
}
