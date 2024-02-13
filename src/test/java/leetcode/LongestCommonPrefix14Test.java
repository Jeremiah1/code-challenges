package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LongestCommonPrefix14Test {

    @Test
    void givenStringArray_returnCommonPrefix() {
        String[] given = new String[]{
                "flower", "flow", "flight"
        };

        String result = LongestCommonPrefix14.longestCommonPrefix(given);
        String expected = "fl";

        assertThat(result).isEqualTo(expected);


        given = new String[]{
                "ab", "a"
        };

        result = LongestCommonPrefix14.longestCommonPrefix(given);
        expected = "a";

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void givenStringArrayWithCommonPrefix_returnEmptyString() {
        String[] given = new String[]{
                "flower", "dog", "cat"
        };

        String result = LongestCommonPrefix14.longestCommonPrefix(given);

        assertThat(result).isEmpty();
    }

    @Test
    void givenEmptyString_returnEmptyString() {
        String[] given = new String[]{
                "", "flow", "flight"
        };

        String result = LongestCommonPrefix14.longestCommonPrefix(given);

        assertThat(result).isEmpty();
    }
}