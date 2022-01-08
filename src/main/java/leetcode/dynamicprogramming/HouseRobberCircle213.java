package leetcode.dynamicprogramming;

// https://leetcode.com/problems/house-robber-ii/
// Problem 213: House Robber II
public class HouseRobberCircle213 {
    
    private HouseRobberCircle213(){}

    public static Integer rob(int[] nums){

        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);

        int val1 = findMaxMoney(nums, 0, nums.length-2);
        int val2 = findMaxMoney(nums, 1, nums.length-1);

        return Math.max(val1, val2);
    }

    private static Integer findMaxMoney(int[] money, int startHouse, int end){

        int sumMoney[] = new int[money.length];
        
        sumMoney[startHouse] = money[startHouse];
        sumMoney[startHouse + 1] = Math.max(money[startHouse + 1], money[startHouse]);
        
        for (int i = startHouse + 2; i <= end; ++i){

            sumMoney[i] = Math.max(sumMoney[i - 1], sumMoney[i - 2] + money[i]);
        }
        
        return sumMoney[end];
    }
}
