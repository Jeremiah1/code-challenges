package leetcode.dynamicprogramming;

import java.util.Arrays;

// https://leetcode.com/problems/jump-game-ii/
// Problem 45: Jump Game II
public class JumpGame45 {

    private JumpGame45(){}

    public static Integer canJumpDP(int[] nums){

        int[] memo = new int[nums.length];
        Arrays.fill(memo, Integer.MAX_VALUE - 1);
        memo[nums.length - 1 ] = 0;
        
        for ( int i = nums.length - 2; i >= 0 ; i--) {
            int localMin = Integer.MAX_VALUE - 1;
            for ( int jumpVal = nums[i]; jumpVal > 0 ; jumpVal-- ) {
                if ( i + jumpVal < nums.length ){
                    localMin = Math.min(localMin, memo[jumpVal + i] + 1);
                }
            }
            memo[i] = localMin;
        }
        return memo[0];
    }

    public static Integer canJumpGreedy(int[] nums){

        int jumps = 0;
        int currentJumpEnd = 0;
        int farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            farthest = Math.max(farthest, i + nums[i]);
            
            if (i == currentJumpEnd) {
                jumps++;
                currentJumpEnd = farthest;
            }
        }
        return jumps;
    }
}
