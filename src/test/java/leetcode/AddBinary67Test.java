package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class AddBinary67Test {

    @ParameterizedTest
    @MethodSource("generateTestArguments")
    void givenBinaryStrings_addThemAndReturnString(String binaryA, String binaryB, String expected){

        // when
        String actual = AddBinary67.addBinary(binaryA, binaryB);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> generateTestArguments() {
        return Stream.of(
                Arguments.of("11", "1", "100"),
                Arguments.of("1000", "101", "1101"),
                Arguments.of("11111", "1", "100000")
        );
    }
}