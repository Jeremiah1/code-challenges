package codewars.kyu5;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class GreedGameTest {

    @Test
    void givenDiceValues_thenReturnHighestPossibleScore() {

        int[] given = {5, 1, 3, 4, 1};
        int result = GreedGame.greedy(given);
        int expected = 250;
        assertThat(result).isEqualTo(expected);

        given = new int[]{1, 1, 1, 3, 1};
        result = GreedGame.greedy(given);
        expected = 1100;
        assertThat(result).isEqualTo(expected);

        given = new int[]{2, 4, 4, 5, 4};
        result = GreedGame.greedy(given);
        expected = 450;
        assertThat(result).isEqualTo(expected);
    }
}
