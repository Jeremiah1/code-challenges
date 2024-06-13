package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LengthOfLastWord58Test {


    @ParameterizedTest
    @MethodSource("generateTestArguments")
    void givenString_returnLastWord(String input, int expectedLength){

        // when
        int actual = LengthOfLastWord58.lengthOfLastWord(input);

        // then
        assertThat(actual).isEqualTo(expectedLength);
    }

    private static Stream<Arguments> generateTestArguments() {
        // Arguments: input string, expected length
        return Stream.of(
                Arguments.of("  dog blue battery   puppy", 5),
                Arguments.of("     ", 0),
                Arguments.of("extreme programming     second edition    ", 7)
        );
    }
}
