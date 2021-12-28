package codewars.kyu7;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class OddOrEvenTest {

    @Test
    void givenListOfPositiveInts_thenReturnEven(){

        int[] given = {1, 2, 3, 4, 5, 6, 7}; // 28

        String result = OddOrEven.oddOrEven(given);

        assertThat(result).isEqualTo("even");
    }

    @Test
    void givenListOfPositiveInts_thenReturnOdd(){
        
        int[] given = {1, 2, 3, 4, 5, 6}; // 21

        String result = OddOrEven.oddOrEven(given);

        assertThat(result).isEqualTo("odd");
    }

    @Test
    void givenListOfNegativeInts_thenReturnEven(){
        
        int[] given = {-1, -2, -3, -4}; // -10

        String result = OddOrEven.oddOrEven(given);

        assertThat(result).isEqualTo("even");
    }

    @Test
    void givenListOfNegativeInts_thenReturnOdd(){
        
        int[] given = {-1, -2, -3, -4, -5}; // -15

        String result = OddOrEven.oddOrEven(given);

        assertThat(result).isEqualTo("odd");
    }

    @Test
    void givenListOfPositiveAndNegativeInts_thenReturnEven(){
        
        int[] given = {-1, -2, -3, -4, -5, 5, 4}; // -6

        String result = OddOrEven.oddOrEven(given);

        assertThat(result).isEqualTo("even");
    }

    @Test
    void givenListOfPositiveAndNegativeInts_thenReturnOdd(){
        
        int[] given = {-1, -2, -3, -4, -5, 5, 4, 3}; // -3

        String result = OddOrEven.oddOrEven(given);

        assertThat(result).isEqualTo("odd");
    }

    @Test
    void givenEmptyList_thenReturnEven(){

        int[] given = {}; // To be treated as {0}

        String result = OddOrEven.oddOrEven(given);
        
        assertThat(result).isEqualTo("even");
    }
}
