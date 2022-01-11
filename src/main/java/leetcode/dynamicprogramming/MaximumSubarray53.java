package leetcode.dynamicprogramming;

// https://leetcode.com/problems/maximum-subarray/
// Problem 53: Maximum Subarray
public class MaximumSubarray53 {
    
    private MaximumSubarray53(){}

    // Kadane's Algorithm
    public static Integer maxSubarray(int[] nums){

        int current = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(current < 0){
                current = nums[i];
            }
            else{
                current += nums[i];
            }
            max = Math.max(current, max);
        }

        return max;
    }
}
