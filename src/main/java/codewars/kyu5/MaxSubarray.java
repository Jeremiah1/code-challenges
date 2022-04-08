package codewars.kyu5;

// https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c/train/java
// Problem: Maximum subarray sum
public class MaxSubarray {
    
    private MaxSubarray(){}

    // Kadane's Algorithm
    public static int sequence(int[] arr) {

        int maxSum = 0;
        int curSum = 0;

        for (int i = 0; i < arr.length; i++) {
            
            curSum = Math.max(0, curSum + arr[i]);
            maxSum = Math.max(curSum, maxSum);
        }
        
        return maxSum;
    }
}
