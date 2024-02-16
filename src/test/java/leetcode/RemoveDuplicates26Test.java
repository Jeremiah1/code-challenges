package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RemoveDuplicates26Test {

    @Test
    void givenArrayOfInts_thenReturnUniqueNumbers() {
        int[] nums = new int[]{0,0,1,1,2,2,3};
        int result = RemoveDuplicates26.removeDuplicates(nums);
        int expected = 4;
        int[] expectedArray = new int[]{0,1,2,3,2,2,3};

        assertThat(result).isEqualTo(expected);
        assertThat(nums).isEqualTo(expectedArray);


        nums = new int[]{-1,1,2,3};
        result = RemoveDuplicates26.removeDuplicates(nums);
        expectedArray = new int[]{-1,1,2,3};

        assertThat(result).isEqualTo(expected);
        assertThat(nums).isEqualTo(expectedArray);
    }

    @Test
    void givenArrayWithOneNumber_thenReturnUniqueNumbers() {
        int[] nums = new int[]{0};
        int result = RemoveDuplicates26.removeDuplicates(nums);
        int expected = 1;
        int[] expectedArray = new int[]{0};

        assertThat(result).isEqualTo(expected);
        assertThat(nums).isEqualTo(expectedArray);


        nums = new int[]{0,0,0};
        result = RemoveDuplicates26.removeDuplicates(nums);
        expectedArray = new int[]{0,0,0};

        assertThat(result).isEqualTo(expected);
        assertThat(nums).isEqualTo(expectedArray);
    }
}