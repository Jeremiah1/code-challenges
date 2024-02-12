package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RomanInteger13Test {

    @Test
    void givenRomanNumber_thenReturnInteger(){

        String given = "MCMXCIV";
        int result = RomanInteger13.romanToInt(given);
        int expected = 1994;

        assertThat(result).isEqualTo(expected);

        given = "MMMCMXCIX";
        result = RomanInteger13.romanToInt(given);
        expected = 3999;

        assertThat(result).isEqualTo(expected);
    }
}