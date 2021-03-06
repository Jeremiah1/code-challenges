package leetcode.dynamicprogramming.studyplan.level1;

// https://leetcode.com/problems/fibonacci-number/
// Problem 509: Fibonacci Number
class Fibonacci509 {
    
    private Fibonacci509(){}

    public static int fib(int n) {

        int[] fibNums = new int[Math.max(2, n+1)];
        fibNums[0] = 0;
        fibNums[1] = 1;

        for(int i = 2; i < n+1; i++){
            fibNums[i] = fibNums[i-1] + fibNums[i-2];
        }

        return fibNums[n];
    }

    public static int fibonacciMemoization(int n) {

        int[] fibNums = new int[Math.max(2, n+1)];

        return fibonacciRecursion(fibNums, n);
    }

    private static int fibonacciRecursion(int[] fibNums, int n){

        if(n == 0) return 0;
        if(n == 1) return 1;

        int a = (fibNums[n-1] > 0) ? fibNums[n-1] : fibonacciRecursion(fibNums, n-1);
        int b = (fibNums[n-2] > 0) ? fibNums[n-2] : fibonacciRecursion(fibNums, n-2);

        fibNums[n] = a + b;
        return a + b;
    }
}
