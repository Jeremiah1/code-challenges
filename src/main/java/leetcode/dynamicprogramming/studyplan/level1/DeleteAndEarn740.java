package leetcode.dynamicprogramming.studyplan.level1;

// https://leetcode.com/problems/delete-and-earn/
// Problem 740: Delete and Earn
public class DeleteAndEarn740 {

    private DeleteAndEarn740(){}

    public static Integer deleteAndEarn(int[] nums) {

        int[] count = new int[10_001];
        for(int x : nums) count[x]++;
        
        int[] sum = new int[10_001];
        sum[1] = count[1];
        sum[2] = Math.max(count[1], 2*count[2]);
        
        for(int i = 3; i < 10_001; i++){
            sum[i] = Math.max(sum[i-1], sum[i-2] + i*count[i]);
        }
        return sum[10_000];
    }
}
