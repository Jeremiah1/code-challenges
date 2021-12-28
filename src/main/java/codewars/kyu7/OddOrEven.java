package codewars.kyu7;

import java.util.Arrays;

// https://www.codewars.com/kata/5949481f86420f59480000e7/java
// Problem: Odd Or Even?
public class OddOrEven {

    private OddOrEven(){}

    public static String oddOrEven (int[] array) {

        int sum = Arrays.stream(array).sum();

        return (sum % 2 == 0) ? "even" : "odd";
    }
}
