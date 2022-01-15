package leetcode.dynamicprogramming.studyplan.level1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Tribonacci1137Test {

    @Test
    void givenWholeNumberN_thenReturnNthTribonacciNumber() {

        int given = 4;
        int expected = 4;
        int result = Tribonacci1137.tribonacci(given);
        assertThat(result).isEqualTo(expected);

        given = 10;
        expected = 149;
        result = Tribonacci1137.tribonacci(given);
        assertThat(result).isEqualTo(expected);

        given = 25;
        expected = 1389537;
        result = Tribonacci1137.tribonacci(given);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void givenWholeNumberN_thenReturnNthTribonacciWithMemoizedRecursion() {

        int given = 4;
        int expected = 4;
        int result = Tribonacci1137.tribonacciMemoized(given);
        assertThat(result).isEqualTo(expected);

        given = 10;
        expected = 149;
        result = Tribonacci1137.tribonacciMemoized(given);
        assertThat(result).isEqualTo(expected);

        given = 25;
        expected = 1389537;
        result = Tribonacci1137.tribonacciMemoized(given);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void givenZero_thenReturnZero() {

        int given = 0;
        int result = Tribonacci1137.tribonacci(given);
        assertThat(result).isZero();

        result = Tribonacci1137.tribonacciMemoized(given);
        assertThat(result).isZero();
    }

    @Test
    void givenOneOrTwo_thenReturnOne() {

        int given = 1;
        int expected = 1;
        int result = Tribonacci1137.tribonacci(given);
        assertThat(result).isEqualTo(expected);

        result = Tribonacci1137.tribonacciMemoized(given);
        assertThat(result).isEqualTo(expected);

        given = 2;
        result = Tribonacci1137.tribonacci(given);
        assertThat(result).isEqualTo(expected);

        result = Tribonacci1137.tribonacciMemoized(given);
        assertThat(result).isEqualTo(expected);
    }
}
