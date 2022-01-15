package leetcode.dynamicprogramming.studyplan.level1;

// https://leetcode.com/problems/jump-game/
// Problem 55: Jump Game
public class JumpGame55 {

    private JumpGame55(){}

    // O(n)
    public static Boolean canJumpGreedy(int[] nums) {
        
        int lastGood = nums.length-1;

        for(int i = nums.length-2; i >= 0; i--){
            if(i + nums[i] >= lastGood){
                lastGood = i;
            }
        }
        return lastGood == 0;
    }
    
    // O(n²)
    public static Boolean canJumpBottomUp(int[] nums) {

        int[] status = new int[nums.length];
        status[nums.length-1] = 1;

        for (int i = nums.length-2; i >= 0; i--) {
            int end = Math.min(i + nums[i], nums.length-1);
            for(int j = i+1; j <= end; j++){
                if(status[j] == 1){
                    status[i] = 1;
                    break;
                }
            }
        }
        
        return status[0] == 1;
    }
    
    // O(n²)
    public static Boolean canJumpTopDown(int[] nums) {
        int[] status = new int[nums.length];
        status[nums.length-1] = 1;
        return canJumpTopDown(nums, status, 0);
    }

    private static boolean canJumpTopDown(int[] nums, int[] status, int index) {
        if(index >= nums.length-1) return true;
        if(status[index] != 0) return status[index] == 1; 

        for (int i = nums[index]; i > 0; i--) {
            if(canJumpTopDown(nums, status, index + i)){
                status[index] = 1;
                return true;
            }
        }
        status[index] = -1;
        return false;
    }
}
