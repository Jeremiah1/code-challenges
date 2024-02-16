package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ValidParenthesis20Test {

    @Test
    void givenValidParenthesisString_thenReturnTrue() {

        String given = "()[]{}";
        boolean result = ValidParenthesis20.isValid(given);

        assertThat(result).isTrue();

        given = "([{}])";
        result = ValidParenthesis20.isValid(given);

        assertThat(result).isTrue();

    }
    @Test
    void givenInvalidParenthesisString_thenReturnFalse() {
        String given = "(";
        boolean result = ValidParenthesis20.isValid(given);

        assertThat(result).isFalse();

        given = "([)]";
        result = ValidParenthesis20.isValid(given);

        assertThat(result).isFalse();

        given = "({";
        result = ValidParenthesis20.isValid(given);

        assertThat(result).isFalse();
    }
}