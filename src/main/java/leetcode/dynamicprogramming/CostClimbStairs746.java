package leetcode.dynamicprogramming;

import java.util.Arrays;

// https://leetcode.com/problems/min-cost-climbing-stairs/
// Problem 746: Min Cost Climbing Stairs
public class CostClimbStairs746 {

    private CostClimbStairs746(){}

    public static Integer minCostClimbingStairsIterative(int[] cost){

        int n = cost.length;
        int[] path = new int[n+1];
        path[0] = 0;
        path[1] = 0;

        for(int i = 2; i <= n; i++){
            path[i] = Math.min(path[i-1] + cost[i-1], path[i-2] + cost[i-2]);
        }

        return path[n];
    }

    public static Integer minCostClimbingStairs(int[] cost) {

        int n = cost.length;
        int[] stepMinCost = new int[n+1];
        Arrays.fill(stepMinCost, -1);

        return findMinStepWeight(cost, stepMinCost, n);
    }

    private static int findMinStepWeight(int[] cost, int[] stepMinCost, int n) {

        if(n == 0 || n == 1) return 0;

        int cost1Step = cost[n-1] + ((stepMinCost[n-1] != -1) ? stepMinCost[n-1] : findMinStepWeight(cost, stepMinCost, n-1));
        int cost2Step = cost[n-2] + ((stepMinCost[n-2] != -1) ? stepMinCost[n-2] : findMinStepWeight(cost, stepMinCost, n-2));

        stepMinCost[n] = Math.min(cost1Step, cost2Step);

        return stepMinCost[n];
    }
}
