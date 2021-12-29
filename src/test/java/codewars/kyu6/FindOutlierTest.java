package codewars.kyu6;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FindOutlierTest {

    @Test
    void givenEvenOutlier_thenReturnFoundEvenNumber() {

        int[] given = {1, 3, 5, 9, 7, 2};
        int result = FindOutlier.find(given);
        assertThat(result).isEven();

        given = new int[]{1, 6, 5, 7, 9};
        result = FindOutlier.find(given);
        assertThat(result).isEven();

        given = new int[]{2, 3, 5, 9, 7};
        result = FindOutlier.find(given);
        assertThat(result).isEven();
    }

    @Test
    void givenOddOutlier_thenReturnFoundOddNumber() {

        int[] given = {3, 2, 4, 6, 8};
        int result = FindOutlier.find(given);
        assertThat(result).isOdd();

        given = new int[]{2, 4, 6, 8, 3};
        result = FindOutlier.find(given);
        assertThat(result).isOdd();

        given = new int[]{2, 4, 3, 8, 10};
        result = FindOutlier.find(given);
        assertThat(result).isOdd();
    }

    @Test
    void givenMixOfIntegers_thenReturnFoundOddNumber() {

        int[] given = {3, -2, 4, -6, 8};
        int result = FindOutlier.find(given);
        assertThat(result).isOdd();

        given = new int[]{-2, -4, -6, -8, 3};
        result = FindOutlier.find(given);
        assertThat(result).isOdd();

        given = new int[]{-2, 4, 3, 8, 10};
        result = FindOutlier.find(given);
        assertThat(result).isOdd();
    }
}
