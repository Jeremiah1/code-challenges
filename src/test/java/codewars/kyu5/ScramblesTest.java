package codewars.kyu5;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ScramblesTest {

    @Test
    void whenGivenStringIsScrambled_thenReturnTrue() {

        String given1 = "rkqodlw";
        String given2 = "world";

        boolean result = Scrambles.scramble(given1, given2);
        assertThat(result).isTrue();

        // ==========================================
        
        given1 = "cedewaraaossoqqyt";
        given2 = "codewars";
        
        result = Scrambles.scramble(given1, given2);
        assertThat(result).isTrue();

        // ==========================================
        
        given1 = "scriptingjava";
        given2 = "javascript";
        
        result = Scrambles.scramble(given1, given2);
        assertThat(result).isTrue();
        
    }

    @Test
    void whenGivenStringIsNotScrambled_thenReturnFalse() {

        String given1 = "katas";
        String given2 = "steak";

        boolean result = Scrambles.scramble(given1, given2);
        assertThat(result).isFalse();

        // ==========================================
        
        given1 = "scriptjavx";
        given2 = "javascript";
        
        result = Scrambles.scramble(given1, given2);
        assertThat(result).isFalse();
        
        // ==========================================

        given1 = "javscripts";
        given2 = "javascript";

        result = Scrambles.scramble(given1, given2);
        assertThat(result).isFalse();
    }
}
