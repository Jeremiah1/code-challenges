package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FindIndexFirstOccurrence28Test {

    @Test
    void givenHaystackAndNeedle_thenReturnIndexOfNeedle() {

        // given
        String givenNeedle = "test";
        String givenHaystack = "can you find test in this haystack";

        // when
        int actualIndex = FindIndexFirstOccurrence28.findIndex(givenHaystack, givenNeedle);
        int expectedIndex = 13;

        // then
        assertThat(actualIndex).isEqualTo(expectedIndex);
    }

    @Test
    void givenNeedleNotFound_thenReturnNegativeOne() {

        // given
        String givenNeedle = "test";
        String givenHaystack = "blahblahblah blah";

        // when
        int actualIndex = FindIndexFirstOccurrence28.findIndex(givenHaystack, givenNeedle);
        int expectedIndex = -1;

        // then
        assertThat(actualIndex).isEqualTo(expectedIndex);
    }
}