package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PlusOne66Test {

    @ParameterizedTest
    @MethodSource("generateTestArguments")
    void givenIntArray_returnResult(int[] given, int[] expected){

        int[] actual = PlusOne66.plusOne(given);

        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> generateTestArguments() {
        return Stream.of(
          Arguments.of(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 5}),
          Arguments.of(new int[]{1, 2, 3, 9}, new int[]{1, 2, 4, 0}),
          Arguments.of(new int[]{9}, new int[]{1, 0}),
          Arguments.of(new int[]{0}, new int[]{1})
        );
    }
}