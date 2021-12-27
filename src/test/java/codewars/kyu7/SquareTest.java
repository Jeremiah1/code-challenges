package codewars.kyu7;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void givenNegativeInteger_thenReturnFalse(){

        boolean result = Square.isSquare(-1);
        assertThat(result).isFalse();
    }

    @Test
    void givenNonSquareInteger_thenReturnFalse(){

        boolean result = Square.isSquare(12);
        assertThat(result).isFalse();
    }

    @Test
    void givenSquareInteger_thenReturnTrue(){

        boolean result = Square.isSquare(36);
        assertThat(result).isTrue();
    }
}
