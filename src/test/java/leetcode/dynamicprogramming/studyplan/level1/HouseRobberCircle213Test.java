package leetcode.dynamicprogramming.studyplan.level1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import leetcode.dynamicprogramming.studyplan.level1.HouseRobberCircle213;

class HouseRobberCircle213Test {

    @Test
    void givenArrayOfMoneyInEachHouse_thenReturnMaxMoneyToSteal() {

        int[] given = {1, 2, 3, 1};
        int expected = 4;
        int result = HouseRobberCircle213.rob(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{2, 3, 2};
        expected = 3;
        result = HouseRobberCircle213.rob(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{1, 2, 1, 1};
        expected = 3;
        result = HouseRobberCircle213.rob(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{2, 1, 1, 2};
        expected = 3;
        result = HouseRobberCircle213.rob(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{1, 2, 3};
        expected = 3;
        result = HouseRobberCircle213.rob(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{100};
        expected = 100;
        result = HouseRobberCircle213.rob(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{10, 20};
        expected = 20;
        result = HouseRobberCircle213.rob(given);
        assertThat(result).isEqualTo(expected);

        given = new int[]{50, 20};
        expected = 50;
        result = HouseRobberCircle213.rob(given);
        assertThat(result).isEqualTo(expected);
    }
}
