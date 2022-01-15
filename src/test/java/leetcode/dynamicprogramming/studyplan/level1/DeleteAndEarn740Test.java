package leetcode.dynamicprogramming.studyplan.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import leetcode.dynamicprogramming.studyplan.level1.DeleteAndEarn740;

class DeleteAndEarn740Test {

    @Test
    void givenListOfNumbers_thenReturnMaximumPoints() {

        int[] given = {3, 4, 2};
        int expected = 6;
        int result = DeleteAndEarn740.deleteAndEarn(given);
        Assertions.assertThat(result).isEqualTo(expected);

        given = new int[]{2, 2, 3, 3, 3, 4};
        expected = 9;
        result = DeleteAndEarn740.deleteAndEarn(given);
        Assertions.assertThat(result).isEqualTo(expected);

        given = new int[]{2, 3};
        expected = 3;
        result = DeleteAndEarn740.deleteAndEarn(given);
        Assertions.assertThat(result).isEqualTo(expected);

        given = new int[]{10};
        expected = 10;
        result = DeleteAndEarn740.deleteAndEarn(given);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}
