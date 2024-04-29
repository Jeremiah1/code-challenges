package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SearchInsertPosition35Test {

    @ParameterizedTest
    @MethodSource("generateTestArguments")
    void givenListOfNumbersAndTarget_returnIndexOfTarget(int[] nums, int target, int expected) {

        // when
        int actual = SearchInsertPosition35.searchInsert(nums, target);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> generateTestArguments() {
        // Arguments: numbers, target, expected
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 6}, 4, 2),
                Arguments.of(new int[]{1, 3, 5, 6}, 7, 4),
                Arguments.of(new int[]{5}, 7, 1),
                Arguments.of(new int[]{5}, 2, 0)
        );
    }
}