package leetcode.dynamicprogramming.studyplan.level1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ClimbingStairs70Test {

    @Test
    void givenNumberOfStairs_thenReturnDistinctNumberOfPaths(){

        int given = 3;
        int expected = 3;
        int result = ClimbingStairs70.climbStairs(given);
        assertThat(result).isEqualTo(expected);
        
        given = 4;
        expected = 5;
        result = ClimbingStairs70.climbStairs(given);
        assertThat(result).isEqualTo(expected);

        given = 2;
        expected = 2;
        result = ClimbingStairs70.climbStairs(given);
        assertThat(result).isEqualTo(expected);
    }
}
