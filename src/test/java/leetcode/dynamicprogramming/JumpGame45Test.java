package leetcode.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class JumpGame45Test {

    @Test
    void givenListOfJumpLengths_thenCanJumpReturnsMinimumJumpsDP() {

        int[] given = {2, 3, 1, 1, 4};
        int result = JumpGame45.canJumpDP(given);
        int expected = 2;
        assertThat(result).isEqualTo(expected);

        given = new int[]{2, 3, 0, 1, 4};
        result = JumpGame45.canJumpDP(given);
        expected = 2;
        assertThat(result).isEqualTo(expected);

        given = new int[]{12};
        result = JumpGame45.canJumpDP(given);
        expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void givenListOfJumpLengths_thenCanJumpReturnsMinimumJumpsGreedy() {

        int[] given = {2, 3, 1, 1, 4};
        int result = JumpGame45.canJumpGreedy(given);
        int expected = 2;
        assertThat(result).isEqualTo(expected);

        given = new int[]{2, 3, 0, 1, 4};
        result = JumpGame45.canJumpGreedy(given);
        expected = 2;
        assertThat(result).isEqualTo(expected);

        given = new int[]{12};
        result = JumpGame45.canJumpGreedy(given);
        expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}
