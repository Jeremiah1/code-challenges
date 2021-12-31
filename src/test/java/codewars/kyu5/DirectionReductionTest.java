package codewars.kyu5;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DirectionReductionTest {

    @Test
    void givenDirections_thenReturnSimplifiedDirections() {

        String[] given = {"NORTH", "NORTH", "SOUTH",  "SOUTH", "WEST"};
        String[] result = DirectionReduction.dirReduc(given);
        String[] expected = {"WEST"};
        assertThat(result).isEqualTo(expected);

        given = new String[]{"SOUTH", "NORTH", "NORTH", "SOUTH",  "SOUTH", "WEST"};
        result = DirectionReduction.dirReduc(given);
        expected = new String[]{"SOUTH", "WEST"};
        assertThat(result).isEqualTo(expected);
        
        given = new String[]{"SOUTH", "WEST", "EAST", "EAST",  "WEST", "WEST"};
        result = DirectionReduction.dirReduc(given);
        expected = new String[]{"SOUTH", "WEST"};
        assertThat(result).isEqualTo(expected);

        given = new String[]{"SOUTH", "WEST", "NORTH", "EAST"};
        result = DirectionReduction.dirReduc(given);
        expected = new String[]{"SOUTH", "WEST", "NORTH", "EAST"};
        assertThat(result).isEqualTo(expected);
    }
    
    @Test
    void givenAllDirectionsSimplified_thenReturnEmptyArray() {
        
        String[] given = {"EAST", "NORTH", "NORTH", "SOUTH",  "SOUTH", "WEST"};
        String[] result = DirectionReduction.dirReduc(given);
        assertThat(result).isEmpty();

        given = new String[]{"SOUTH", "EAST", "WEST", "NORTH", "NORTH", "SOUTH"};
        result = DirectionReduction.dirReduc(given);
        assertThat(result).isEmpty();
    }

    @Test
    void givenEmptyArray_thenReturnEmptyArray() {
        
        String[] given = {};
        String[] result = DirectionReduction.dirReduc(given);
        assertThat(result).isEmpty();
    }
}
