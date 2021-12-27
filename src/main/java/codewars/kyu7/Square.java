package codewars.kyu7;

// https://www.codewars.com/kata/54c27a33fb7da0db0100040e/train/java
// Problem: You're A Square
public class Square {
    
    private Square(){}
    
    public static boolean isSquare(int n){
        if(n < 0) return false;

        double squareRoot = Math.sqrt(n);
        return Math.floor(squareRoot) == squareRoot;
    }
}
