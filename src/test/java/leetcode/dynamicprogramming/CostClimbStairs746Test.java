package leetcode.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CostClimbStairs746Test {

    @Test
    void whenGivenCostPerStep_thenReturnMinimumCostRecursion(){

        int[] given = {10, 15, 20};
        int expected = 15;
        int result = CostClimbStairs746.minCostClimbingStairs(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        expected = 6;
        result = CostClimbStairs746.minCostClimbingStairs(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{5, 9, 2, 3};
        expected = 7;
        result = CostClimbStairs746.minCostClimbingStairs(given);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenGivenCostPerStep_thenReturnMinimumCostIterative(){

        int[] given = {10, 15, 20};
        int expected = 15;
        int result = CostClimbStairs746.minCostClimbingStairsIterative(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        expected = 6;
        result = CostClimbStairs746.minCostClimbingStairsIterative(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{5, 9, 2, 3};
        expected = 7;
        result = CostClimbStairs746.minCostClimbingStairsIterative(given);
        assertThat(result).isEqualTo(expected);
    }
}
