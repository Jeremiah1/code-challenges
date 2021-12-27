package codewars.kyu6;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

// "Same" means the elements in b are the elements in a squared, regardless of the order.
class AreSameTest {

    @Test
    void givenArraysAreSame_thenReturnTrue() {
        int[] givenA = {-11, 121, 144, 144, 19, 19, 19, 161};
        int[] givenB = {11*11, 121*121, 144*144, 144*144, 19*19, 19*19, 19*19, 161*161};

        boolean result = AreSame.comp(givenA, givenB);
        assertThat(result).isTrue();
    }

    @Test
    void givenArraysAreNotSame_thenReturnFalse() {
        int[] givenA = {11, 121, 144, 144, 19, 19, 19, 161};
        int[] givenB = {11*11, 121*121, 144*144, 144*144, 19*19, 19*19, 19*19, 17};

        boolean result = AreSame.comp(givenA, givenB);
        assertThat(result).isFalse();
    }

    @Test
    void givenNullArrays_thenReturnFalse() {
        int[] givenA = null;
        int[] givenB = null;

        boolean result = AreSame.comp(givenA, givenB);
        assertThat(result).isFalse();
    }

    @Test
    void givenEmptyArrays_thenReturnTrue() {
        int[] givenA = {};
        int[] givenB = {};

        boolean result = AreSame.comp(givenA, givenB);
        assertThat(result).isTrue();
    }

    @Test
    void givenEmptyAndNullArray_thenReturnFalse() {
        int[] givenA = {};
        int[] givenB = null;

        boolean result = AreSame.comp(givenA, givenB);
        assertThat(result).isFalse();
    }

    @Test
    void givendifferentSizedArrays_thenReturnFalse() {
        int[] givenA = {1, 2, 3};
        int[] givenB = {1, 2};

        boolean result = AreSame.comp(givenA, givenB);
        assertThat(result).isFalse();
    }
}
