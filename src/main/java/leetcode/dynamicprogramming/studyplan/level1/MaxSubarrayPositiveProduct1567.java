package leetcode.dynamicprogramming.studyplan.level1;

// https://leetcode.com/problems/maximum-length-of-subarray-with-positive-product/
// Problem 1567: Maximum Length of Subarray With Positive Product
public class MaxSubarrayPositiveProduct1567 {
    
    private MaxSubarrayPositiveProduct1567(){}

    public static Integer getMaxLength(int[] nums){

        int posCount = 0;
        int negCount = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            
            if(nums[i] == 0){
                posCount = 0;
                negCount = 0;
            }
            else if(nums[i] > 0){
                posCount++;
                if(negCount != 0) negCount++;
            }
            else{
                // ======= SWAP Numbers ========
                posCount += negCount;
                negCount = posCount - negCount;
                posCount -= negCount;
                // =============================

                negCount++;
                if(posCount != 0) posCount++;
            }
            max = Math.max(max, posCount);
        }
        return max;
    }
}
