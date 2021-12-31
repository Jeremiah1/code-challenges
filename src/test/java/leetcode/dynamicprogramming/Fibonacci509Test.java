package leetcode.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Fibonacci509Test {

    @Test
    void givenWholeNumberN_thenReturnNthFibonacciNumber() {
        
        int given = 4;
        int result = Fibonacci509.fib(given);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
        
        given = 10;
        result = Fibonacci509.fib(given);
        expected = 55;
        assertThat(result).isEqualTo(expected);

        given = 12;
        result = Fibonacci509.fib(given);
        expected = 144;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void givenWholeNumberN_thenReturnNthFibonacciNumberWithMemoizedRecursion() {
        
        int given = 4;
        int result = Fibonacci509.fibRecursion(given);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
        
        given = 10;
        result = Fibonacci509.fibRecursion(given);
        expected = 55;
        assertThat(result).isEqualTo(expected);

        given = 12;
        result = Fibonacci509.fibRecursion(given);
        expected = 144;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void givenZero_thenReturnZero() {

        int given = 0;
        int result = Fibonacci509.fib(given);
        assertThat(result).isZero();
    }

    @Test
    void givenOne_thenReturnOne() {

        int given = 1;
        int result = Fibonacci509.fib(given);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}
