package leetcode.dynamicprogramming.studyplan.level1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/maximum-product-subarray/
// Problem 152: Maximum Product Subarray
public class MaximumProductSubarray152 {

    private MaximumProductSubarray152(){}

    public static Integer maxProduct(int[] nums){ 

        
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = maxSoFar;

        List<Integer> numbers = new LinkedList<>();
        for (int i = 1; i < nums.length; i++) {

            int a = maxSoFar * nums[i];
            int b = minSoFar * nums[i];
            
            Collections.addAll(numbers, nums[i], a, b);
            minSoFar = Collections.min(numbers);
            maxSoFar = Collections.max(numbers);

            result = Math.max(maxSoFar, result);
            numbers.clear();
        }

        return result;
    }
}
