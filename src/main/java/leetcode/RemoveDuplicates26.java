package leetcode;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Problem 26: Remove Duplicates from Sorted Array
public class RemoveDuplicates26 {

    private RemoveDuplicates26(){}

    public static int removeDuplicates(int[] nums) {

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
