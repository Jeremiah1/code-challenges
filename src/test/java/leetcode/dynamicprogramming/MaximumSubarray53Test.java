package leetcode.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MaximumSubarray53Test {

    @Test
    void givenListOfIntegers_thenReturnMaxSubarraySum(){

        int[] given = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6;
        int result = MaximumSubarray53.maxSubarray(given);
        assertThat(result).isEqualTo(expected);
        
        given = new int[]{5, 4, -1, 7, 8};
        expected = 23;
        result = MaximumSubarray53.maxSubarray(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{1};
        expected = 1;
        result = MaximumSubarray53.maxSubarray(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{-10, 22, -5};
        expected = 22;
        result = MaximumSubarray53.maxSubarray(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{-10, -22, -5};
        expected = -5;
        result = MaximumSubarray53.maxSubarray(given);
        assertThat(result).isEqualTo(expected);
    }
    
}
