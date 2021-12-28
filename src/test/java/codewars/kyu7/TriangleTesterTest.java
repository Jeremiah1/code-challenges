package codewars.kyu7;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TriangleTesterTest {

    @Test
    void givenAppropriateSideLengths_thenIsTriangleReturnTrue() {

        boolean result = TriangleTester.isTriangle(3, 4, 5);
        assertThat(result).isTrue();

        result = TriangleTester.isTriangle(7, 9, 10);
        assertThat(result).isTrue();
    }

    @Test
    void givenLongSide_thenIsTriangleReturnFalse() {

        boolean result = TriangleTester.isTriangle(3, 4, 25);
        assertThat(result).isFalse();
    }

    @Test
    void givenTwoSidesEqualThirdSide_thenIsTriangleReturnFalse() {

        boolean result = TriangleTester.isTriangle(3, 4, 7);
        assertThat(result).isFalse();
    }
}
