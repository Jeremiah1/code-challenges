package codewars.kyu7;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class JadenCaseTest {

    JadenCase jadenCase = new JadenCase();

    @Test
	public void givenNonEmptyString_thenReturnJadenCase() {
        String given = "most trees are blue";
        String expected = "Most Trees Are Blue";

        String actual = jadenCase.toJadenCase(given);
        assertThat(actual).isEqualTo(expected);
	}

    @Test
    public void givenNullString_thenReturnNull(){

        String result = jadenCase.toJadenCase(null);
        assertThat(result).isNull();
    }

    @Test
    public void givenEmptyString_thenReturnNull(){

        String result = jadenCase.toJadenCase("");
        assertThat(result).isNull();
    }
}
