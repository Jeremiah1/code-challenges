package leetcode.dynamicprogramming;

import java.util.Arrays;

/**
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
        System.out.println(Arrays.toString(easyCountBits(20)));
        System.out.println(Arrays.toString(dpCountBits(20)));

    }

    public static int[] easyCountBits(int n) {
        int[] countedBits = new int[n+1];

        for(int i = 0; i <= n; i++){
            String binary = Integer.toBinaryString(i);
            countedBits[i] = Integer.bitCount(i);
        }
        return countedBits;
    }

    public static int[] dpCountBits(int n) {
        int[] countedBits = new int[n+1];

        for(int i = 0; i <= n; i++){
            String binary = Integer.toBinaryString(i);


        }
        return countedBits;
    }
}
