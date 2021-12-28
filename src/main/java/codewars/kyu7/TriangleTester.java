package codewars.kyu7;

// https://www.codewars.com/kata/56606694ec01347ce800001b/java
// Problem: Is This A Triangle
public class TriangleTester {
    
    private TriangleTester(){}

    public static boolean isTriangle(int a, int b, int c){

        return (a + b > c && a + c > b && b + c > a);
    }
}
