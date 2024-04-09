package leetcode;

// https://leetcode.com/problems/remove-element/
// Problem 27: Remove Element
public class RemoveElement27 {

    private RemoveElement27(){}

    public static int removeElement(int[] nums, int valueToRemove) {

        int k = nums.length;
        int i = 0;
        while(i < k){
            if(nums[i] == valueToRemove){
                // ===== Swap elements ==========
                nums[i] = nums[i] + nums[k-1];
                nums[k-1] = nums[i] - nums[k-1];
                nums[i] = nums[i] - nums[k-1];
                // ==============================

                k--;
            } else{
                i++;
            }
        }
        return k;
    }
}
