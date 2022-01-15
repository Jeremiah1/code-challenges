package leetcode.dynamicprogramming;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-sum-circular-subarray/
// Problem 918: Maximum Sum Circular Subarray
public class MaximumSumCircular918 {
    
    private MaximumSumCircular918(){}

    public static Integer maxSubarraySumCircularBruteForce(int[] nums){

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            
            int result = kadane(nums, i);
            max = Math.max(max, result);
        }
        return max;
    }

    public static Integer efficientMaxSubarraySumCircularBruteForce(int[] nums){

        int max = Arrays.stream(nums).max().getAsInt();
        if(max < 0) return max;
        
        int potentialMaxSumA = kadane(nums, 0);
        int totalSum = Arrays.stream(nums).sum();
        
        Arrays.setAll(nums, i -> -nums[i]);
        int potentialMaxSumB = totalSum + kadane(nums, 0);

        return Math.max(potentialMaxSumA, potentialMaxSumB);
    }

    private static int kadane(int[] nums, int start) {
        int n = nums.length;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = start; i < n + start; i++) {
            currentSum = Math.max(nums[i % n], currentSum + nums[i % n]);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
