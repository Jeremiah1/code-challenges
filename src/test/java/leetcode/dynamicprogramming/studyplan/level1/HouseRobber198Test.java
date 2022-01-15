package leetcode.dynamicprogramming.studyplan.level1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import leetcode.dynamicprogramming.studyplan.level1.HouseRobber198;

class HouseRobber198Test {

    @Test
    void givenArrayOfMoneyInEachHouse_thenReturnMaxMoneyToSteal() {

        int[] given = {1, 2, 3, 1};
        int expected = 4;
        int result = HouseRobber198.rob(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{2, 7, 9, 3, 1};
        expected = 12;
        result = HouseRobber198.rob(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{100};
        expected = 100;
        result = HouseRobber198.rob(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{10, 20};
        expected = 20;
        result = HouseRobber198.rob(given);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void givenArrayOfMoneyInEachHouse_thenReturnMaxMoneyToStealIterative() {

        int[] given = {1, 2, 3, 1};
        int expected = 4;
        int result = HouseRobber198.robIterative(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{2, 7, 9, 3, 1};
        expected = 12;
        result = HouseRobber198.robIterative(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{100};
        expected = 100;
        result = HouseRobber198.robIterative(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{10, 20};
        expected = 20;
        result = HouseRobber198.robIterative(given);
        assertThat(result).isEqualTo(expected);
    }
}
