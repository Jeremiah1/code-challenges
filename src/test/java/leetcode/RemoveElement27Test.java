package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RemoveElement27Test {

    @Test
    void givenArrayAndValueToRemove_thenValuesRemoved() {

        int[] givenArray = new int[]{1,2,3};
        int givenValueToRemove = 1;

        int actual = RemoveElement27.removeElement(givenArray, givenValueToRemove);
        int expected  = 2;

        assertThat(actual).isEqualTo(expected);
        assertThat(firstKElementsDoesNotContainValue(givenArray, expected, givenValueToRemove)).isTrue();
    }

    @Test
    void givenAllValuesRemoved_thenReturnZero() {

        int[] givenArray = new int[]{2,2,2};
        int givenValueToRemove = 2;

        int actual = RemoveElement27.removeElement(givenArray, givenValueToRemove);
        int expected  = 0;

        assertThat(actual).isEqualTo(expected);
        assertThat(firstKElementsDoesNotContainValue(givenArray, expected, givenValueToRemove)).isTrue();
    }

    @Test
    void givenEmptyArray_thenReturnZero() {

        int[] givenArray = new int[]{};
        int givenValueToRemove = 1;

        int actual = RemoveElement27.removeElement(givenArray, givenValueToRemove);
        int expected  = 0;

        assertThat(actual).isEqualTo(expected);
        assertThat(firstKElementsDoesNotContainValue(givenArray, expected, givenValueToRemove)).isTrue();
    }

    private boolean firstKElementsDoesNotContainValue(int[] nums, int k, int value){

        for(int i = 0; i < k; i++){
            if(nums[i] == value) return false;
        }
        return true;
    }
}