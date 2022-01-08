package leetcode.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/house-robber/
// Problem 198: House Robber
public class HouseRobber198 {
    
    private HouseRobber198(){}

    public static int robIterative(int[] money) {
        int n = money.length;
        if(n == 0) return 0;

        int[] sum = new int[n];
        sum[0] = money[0];
        if(n == 1) return sum[0];

        sum[1] = Math.max(sum[0], money[1]);
        if(n == 2) return sum[1];

        for(int i = 2; i < n; i++){
            sum[i] = Math.max(money[i] + sum[i-2], sum[i-1]);
        }
        return sum[n-1];
    }

    public static Integer rob(int[] money){

        if(money.length == 1) return money[0];

        int[] memo = new int[money.length];
        Arrays.fill(memo, -1);

        int startHouse0 = findMaxMoney(money, memo, 0);
        int startHouse1 = findMaxMoney(money, memo, 1);

        return Math.max(startHouse0, startHouse1);
    }

    private static int findMaxMoney(int[] money, int[] memo, int n) {

        if(n == money.length - 1 || n == money.length - 2) return money[n];

        List<Integer> targets = new ArrayList<>();
        for(int i = n+2; i < money.length; i++){
            targets.add(money[n] + ((memo[i] == -1) ? findMaxMoney(money, memo, i) : memo[i]));
        }

        memo[n] = Collections.max(targets);
        return memo[n];
    }
}
