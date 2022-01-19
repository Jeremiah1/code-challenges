package leetcode.dynamicprogramming.studyplan.level1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MaxSubarrayPositiveProduct1567Test {

    @Test
    void givenListOfNumbers_thenReturnMaxLengthSubarray() {

        int[] given = {1, -2, -3, 4};
        int expected = 4;
        int result = MaxSubarrayPositiveProduct1567.getMaxLength(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{0, -1, 2, -3, -4};
        expected = 3;
        result = MaxSubarrayPositiveProduct1567.getMaxLength(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{0, 1, 2, 0, 3, 4, 5, 0};
        expected = 3;
        result = MaxSubarrayPositiveProduct1567.getMaxLength(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{-4};
        expected = 0;
        result = MaxSubarrayPositiveProduct1567.getMaxLength(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{-4, 2, 3};
        expected = 2;
        result = MaxSubarrayPositiveProduct1567.getMaxLength(given);
        assertThat(result).isEqualTo(expected);
    }
}
