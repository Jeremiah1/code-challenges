package leetcode.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class JumpGame55Test {

    @Test
    void givenListOfJumpLengths_thenCanJumpTopDownReturnsTrue() {

        int[] given = {2, 3, 1, 1, 4};
        boolean result = JumpGame55.canJumpTopDown(given);
        assertThat(result).isTrue();

        given = new int[]{0};
        result = JumpGame55.canJumpTopDown(given);
        assertThat(result).isTrue();
    }

    @Test
    void givenListOfJumpLengths_thenCanJumpTopDownReturnsFalse() {

        int[] given = {3, 2, 1, 0, 4};
        boolean result = JumpGame55.canJumpTopDown(given);
        assertThat(result).isFalse();

        given = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 5};
        result = JumpGame55.canJumpTopDown(given);
        assertThat(result).isFalse();
    }

    @Test
    void givenListOfJumpLengths_thenCanJumpBottomUpReturnsTrue() {

        int[] given = {2, 3, 1, 1, 4};
        boolean result = JumpGame55.canJumpBottomUp(given);
        assertThat(result).isTrue();

        given = new int[]{0};
        result = JumpGame55.canJumpBottomUp(given);
        assertThat(result).isTrue();
    }

    @Test
    void givenListOfJumpLengths_thenCanJumpBottomUpReturnsFalse() {

        int[] given = {3, 2, 1, 0, 4};
        boolean result = JumpGame55.canJumpBottomUp(given);
        assertThat(result).isFalse();

        given = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 5};
        result = JumpGame55.canJumpBottomUp(given);
        assertThat(result).isFalse();
    }

    @Test
    void givenListOfJumpLengths_thenCanJumpGreedyReturnsTrue() {

        int[] given = {2, 3, 1, 1, 4};
        boolean result = JumpGame55.canJumpGreedy(given);
        assertThat(result).isTrue();

        given = new int[]{0};
        result = JumpGame55.canJumpGreedy(given);
        assertThat(result).isTrue();
    }

    @Test
    void givenListOfJumpLengths_thenCanJumpGreedyReturnsFalse() {

        int[] given = {3, 2, 1, 0, 4};
        boolean result = JumpGame55.canJumpGreedy(given);
        assertThat(result).isFalse();

        given = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 5};
        result = JumpGame55.canJumpGreedy(given);
        assertThat(result).isFalse();
    }
}
