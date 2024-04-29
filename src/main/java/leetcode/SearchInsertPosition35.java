package leetcode;

// https://leetcode.com/problems/search-insert-position/description/
// Problem 35: Search Insert Position
public class SearchInsertPosition35 {

    private SearchInsertPosition35(){}

    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;

        while (start <= end) {

            int mid = (end + start)/2;
            if(nums[mid] == target) return mid;

            if (target < nums[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }

        return start;
    }
}
