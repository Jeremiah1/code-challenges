package codewars.kyu6;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ExpandedFormTest {

    @Test
    void givenIntegerWithNoZeros_thenReturnExpandedForm() {

        int given = 9;
        String result = ExpandedForm.expandedForm(given);
        String expected = "9";
        assertThat(result).isEqualTo(expected);

        given = 956;
        result = ExpandedForm.expandedForm(given);
        expected = "900 + 50 + 6";
        assertThat(result).isEqualTo(expected);

        given = 123_456_789;
        result = ExpandedForm.expandedForm(given);
        expected = "100000000 + 20000000 + 3000000 + 400000 + 50000 + 6000 + 700 + 80 + 9";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void givenIntegerWithZeros_thenReturnExpandedFormWithoutZeros() {

        int given = 10;
        String result = ExpandedForm.expandedForm(given);
        String expected = "10";
        assertThat(result).isEqualTo(expected);

        given = 105;
        result = ExpandedForm.expandedForm(given);
        expected = "100 + 5";
        assertThat(result).isEqualTo(expected);

        given = 12_030;
        result = ExpandedForm.expandedForm(given);
        expected = "10000 + 2000 + 30";
        assertThat(result).isEqualTo(expected);

        given = 1_230_056;
        result = ExpandedForm.expandedForm(given);
        expected = "1000000 + 200000 + 30000 + 50 + 6";
        assertThat(result).isEqualTo(expected);
    }
}
