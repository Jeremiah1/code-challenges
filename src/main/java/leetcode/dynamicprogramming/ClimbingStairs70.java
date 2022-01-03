package leetcode.dynamicprogramming;

// https://leetcode.com/problems/climbing-stairs/
// Problem 70: Climbing Stairs
public class ClimbingStairs70 {

    private ClimbingStairs70(){}

    public static Integer climbStairs(int n) {
        
        int[] stepMemo = new int[n+1];

        return (n == 0) ? 0 : climbStairsMemoized(stepMemo, n);
    }

    private static int climbStairsMemoized(int[] stepMemo, int n) {

        if(n == 0 || n == 1) return 1;

        int a = (stepMemo[n-1] > 0) ? stepMemo[n-1] : climbStairsMemoized(stepMemo, n-1);
        int b = (stepMemo[n-2] > 0) ? stepMemo[n-2] : climbStairsMemoized(stepMemo, n-2);

        stepMemo[n] = a + b;
        return a + b;
    }
}
