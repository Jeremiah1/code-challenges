package codewars.kyu6;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TribonacciTest {

    @Test
    void givenNIsZero_thenReturnEmptyArray() {
        double[] startSequence = {1, 1, 1};
        int n = 0;

        double[] actual = Tribonacci.tribonacci(startSequence, n);
        double[] expected = {};

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void givenNIsOne_thenReturnOneElementArray() {
        double[] startSequence = {1, 1, 1};
        int n = 1;

        double[] actual = Tribonacci.tribonacci(startSequence, n);
        double[] expected = {1};

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void givenNIsTwo_thenReturnTwoElementArray() {
        double[] startSequence = {1, 1, 1};
        int n = 2;

        double[] actual = Tribonacci.tribonacci(startSequence, n);
        double[] expected = {1, 1};

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void givenNIsThree_thenReturnThreeElementArray() {
        double[] startSequence = {1, 1, 1};
        int n = 3;

        double[] actual = Tribonacci.tribonacci(startSequence, n);
        double[] expected = {1, 1, 1};

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void givenNIs5_thenReturnFiveElementTribonacciSequence() {
        double[] startSequence = {1, 1, 1};
        int n = 5;
        
        double[] actual = Tribonacci.tribonacci(startSequence, n);
        double[] expected = {1, 1, 1, 3, 5};

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void givenNIs10_thenReturnTenElementTribonacciSequence() {
        double[] startSequence = {1, 1, 1};
        int n = 10;
        
        double[] actual = Tribonacci.tribonacci(startSequence, n);
        double[] expected = {1, 1, 1, 3, 5, 9, 17, 31, 57, 105};

        assertThat(actual).isEqualTo(expected);
    }
}
