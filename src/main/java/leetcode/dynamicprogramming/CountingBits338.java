package leetcode.dynamicprogramming;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * https://leetcode.com/problems/counting-bits/
 *
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
 * ans[i] is the number of 1's in the binary representation of i.
 *
 * ==================
 * Example 1:
 * ==================
 *  Input: n = 2
 *  Output: [0,1,1]
 *  Explanation:
 *  0 --> 0
 *  1 --> 1
 *  2 --> 10
 * ==================
 * Example 2:
 * ==================
 *  Input: n = 5
 *  Output: [0,1,1,2,1,2]
 *  Explanation:
 *  0 --> 0
 *  1 --> 1
 *  2 --> 10
 *  3 --> 11
 *  4 --> 100
 *  5 --> 101
 */
public class CountingBits338 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(easyCountBits(10)));
        System.out.println(Arrays.toString(dpCountBits(10)));
        System.out.println(Arrays.toString(dpCountBits2(10)));

    }

    public static int[] easyCountBits(int n) {
        int[] countedBits = new int[n+1];

        for(int i = 0; i <= n; i++){
            countedBits[i] = Integer.bitCount(i);
        }
        return countedBits;
    }

    public static int[] dpCountBits(int n) {

        Map<String, Integer> dpMap = new HashMap<>();
        int[] countedBits = new int[n+1];

        Deque<String> bits = new LinkedList<>();

        for(int i = 0; i <= n; i++){
            String binary = Integer.toBinaryString(i);

            bits.push(binary);
            while(!bits.isEmpty()){
                String current = bits.pop();

                if(current.charAt(0) == '1') countedBits[i]++;

                if(current.length() > 1){
                    String next = current.substring(1);
                    if(dpMap.containsKey(next)){
                        countedBits[i] += dpMap.get(next);
                    }
                    else{
                        bits.push(next);
                    }
                }
            }
            dpMap.put(binary, countedBits[i]);
        }
        return countedBits;
    }

    // https://leetcode.com/problems/counting-bits/discuss/1076717/How-to-arrive-at-the-DP-Solution-for-this-problem
    public static int[] dpCountBits2(int n){
        int[] result = new int[n+1];
        result[1] = 1;

        int k = 0;
        for(int i = 2; i <= n; i++){
            if(i == Math.pow(2, k+1)) k++;

            result[i] = 1 + result[(int)(i - Math.pow(2, k))];
        }
        return result;
    }
}
