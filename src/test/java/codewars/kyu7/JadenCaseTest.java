package codewars.kyu7;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class JadenCaseTest {

    @Test
	void givenNonEmptyString_thenReturnJadenCase() {
        String given = "most trees are blue";
        String expected = "Most Trees Are Blue";

        String actual = JadenCase.toJadenCase(given);
        assertThat(actual).isEqualTo(expected);
	}

    @Test
    void givenNullString_thenReturnNull(){

        String result = JadenCase.toJadenCase(null);
        assertThat(result).isNull();
    }

    @Test
    void givenEmptyString_thenReturnNull(){

        String result = JadenCase.toJadenCase("");
        assertThat(result).isNull();
    }
}
