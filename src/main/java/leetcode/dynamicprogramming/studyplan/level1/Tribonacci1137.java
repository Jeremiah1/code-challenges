package leetcode.dynamicprogramming.studyplan.level1;

// https://leetcode.com/problems/n-th-tribonacci-number/
// Problem 1137: N-th Tribonacci Number
public class Tribonacci1137 {

    private Tribonacci1137(){}

    public static Integer tribonacci(int n) {

        int[] tribNums = new int[Math.max(3, n+1)];
        tribNums[0] = 0;
        tribNums[1] = tribNums[2] = 1;

        for(int i = 3; i < n+1; i++){
            tribNums[i] = tribNums[i-1] + tribNums[i-2] + tribNums[i-3];
        }
        
        return tribNums[n];
    }

    public static Integer tribonacciMemoized(int n) {
        
        int[] tribNums = new int[Math.max(3, n+1)];

        return tribonacciRecursion(tribNums, n);
    }

    private static Integer tribonacciRecursion(int[] tribNums, int tribIndex){

        if(tribIndex == 0) return 0;
        if(tribIndex == 1 || tribIndex == 2) return 1;

        int a = (tribNums[tribIndex-1] > 0) ? tribNums[tribIndex-1] : tribonacciRecursion(tribNums, tribIndex-1);
        int b = (tribNums[tribIndex-2] > 0) ? tribNums[tribIndex-2] : tribonacciRecursion(tribNums, tribIndex-2);
        int c = (tribNums[tribIndex-3] > 0) ? tribNums[tribIndex-3] : tribonacciRecursion(tribNums, tribIndex-3);
        
        tribNums[tribIndex] = a + b + c;
        return a + b + c;
    }
}
