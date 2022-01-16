package leetcode.dynamicprogramming.studyplan.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumProductSubarray152Test {

    @Test
    void givenArrayOfIntegers_thenReturnMaxProductSubarray() {

        int[] given = {2, 3, -2, 4};
        int expected = 6;
        int result = MaximumProductSubarray152.maxProduct(given);
        Assertions.assertThat(result).isEqualTo(expected);

        given = new int[]{-2, -3, -4, -1};
        expected = 24;
        result = MaximumProductSubarray152.maxProduct(given);
        Assertions.assertThat(result).isEqualTo(expected);

        given = new int[]{-2, -3, -4};
        expected = 12;
        result = MaximumProductSubarray152.maxProduct(given);
        Assertions.assertThat(result).isEqualTo(expected);

        given = new int[]{-2, 0, -1};
        expected = 0;
        result = MaximumProductSubarray152.maxProduct(given);
        Assertions.assertThat(result).isEqualTo(expected);

        given = new int[]{2, 0, -1};
        expected = 2;
        result = MaximumProductSubarray152.maxProduct(given);
        Assertions.assertThat(result).isEqualTo(expected);

        given = new int[]{0, 5, -1};
        expected = 5;
        result = MaximumProductSubarray152.maxProduct(given);
        Assertions.assertThat(result).isEqualTo(expected);

        given = new int[]{5};
        expected = 5;
        result = MaximumProductSubarray152.maxProduct(given);
        Assertions.assertThat(result).isEqualTo(expected);

        given = new int[]{-5};
        expected = -5;
        result = MaximumProductSubarray152.maxProduct(given);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}
