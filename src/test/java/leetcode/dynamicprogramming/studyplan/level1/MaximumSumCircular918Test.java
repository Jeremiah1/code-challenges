package leetcode.dynamicprogramming.studyplan.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumSumCircular918Test {

    @Test
    void givenListOfNumbers_thenReturnMaxSubarraySumCircularBruteForce() {

        int[] given = {1, -2, 3, -2};
        int expected = 3;
        int result = MaximumSumCircular918.maxSubarraySumCircularBruteForce(given);
        Assertions.assertThat(result).isEqualTo(expected);

        given = new int[]{5, -3, 5};
        expected = 10;
        result = MaximumSumCircular918.maxSubarraySumCircularBruteForce(given);
        Assertions.assertThat(result).isEqualTo(expected);

        given = new int[]{-3, -2, -3};
        expected = -2;
        result = MaximumSumCircular918.maxSubarraySumCircularBruteForce(given);
        Assertions.assertThat(result).isEqualTo(expected);

        given = new int[]{2, 1, -5, 4, -3, 1, -3, 4, -1};
        expected = 6;
        result = MaximumSumCircular918.maxSubarraySumCircularBruteForce(given);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void givenListOfNumbers_thenReturnEfficientMaxSubarraySumCircular() {

        int[] given = {1, -2, 3, -2};
        int expected = 3;
        int result = MaximumSumCircular918.efficientMaxSubarraySumCircularBruteForce(given);
        Assertions.assertThat(result).isEqualTo(expected);

        given = new int[]{5, -3, 5};
        expected = 10;
        result = MaximumSumCircular918.efficientMaxSubarraySumCircularBruteForce(given);
        Assertions.assertThat(result).isEqualTo(expected);

        given = new int[]{-3, -2, -3};
        expected = -2;
        result = MaximumSumCircular918.efficientMaxSubarraySumCircularBruteForce(given);
        Assertions.assertThat(result).isEqualTo(expected);

        given = new int[]{2, 1, -5, 4, -3, 1, -3, 4, -1};
        expected = 6;
        result = MaximumSumCircular918.efficientMaxSubarraySumCircularBruteForce(given);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}
