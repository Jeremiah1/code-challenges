package codewars.kyu6;

import java.util.Arrays;

// https://www.codewars.com/kata/556deca17c58da83c00002db/train/java
// Problem: Tribonacci Sequence
public class Tribonacci {
    
    private Tribonacci(){}

    public static double[] tribonacci(double[] nums, int n) {

        double[] result = Arrays.copyOf(nums, n);

        for(int i = 3; i < n; i++){
            result[i] = result[i-1] + result[i-2] + result[i-3];
        }

        return result;
    }
}
