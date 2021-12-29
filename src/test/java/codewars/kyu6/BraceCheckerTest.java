package codewars.kyu6;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BraceCheckerTest {

    @Test
    void givenValidStringOfBraces_thenReturnTrue() {

        String given = "{}()[]";
        boolean result = BraceChecker.isValid(given);
        assertThat(result).isTrue();

        given = "{{{[[[((()))]]]}}}";
        result = BraceChecker.isValid(given);
        assertThat(result).isTrue();

        given = "({}[](()){{}}({[]}))";
        result = BraceChecker.isValid(given);
        assertThat(result).isTrue();
    }

    @Test
    void givenInvalidStringOfBraces_thenReturnFalse(){
    
        String given = "{]";
        boolean result = BraceChecker.isValid(given);
        assertThat(result).isFalse();

        given = "]{}]";
        result = BraceChecker.isValid(given);
        assertThat(result).isFalse();

        given = "{{[[(())";
        result = BraceChecker.isValid(given);
        assertThat(result).isFalse();

        given = "{}[]((}";
        result = BraceChecker.isValid(given);
        assertThat(result).isFalse();
    } 
}
