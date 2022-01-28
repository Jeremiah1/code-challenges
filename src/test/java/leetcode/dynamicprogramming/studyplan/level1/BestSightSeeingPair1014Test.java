package leetcode.dynamicprogramming.studyplan.level1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BestSightSeeingPair1014Test {

    @Test
    void givenArrayOfNumbers_thenReturnBestSightSeeingPair() {

        int[] given = {8, 1, 5, 2, 6};
        int expected = 11;
        int result = BestSightSeeingPair1014.maxScoreSightseeingPair(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{1, 2};
        expected = 2;
        result = BestSightSeeingPair1014.maxScoreSightseeingPair(given);
        assertThat(result).isEqualTo(expected);
    }
}
