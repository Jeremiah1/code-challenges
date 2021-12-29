package codewars.kyu6;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PersistentBuggerTest {

    @Test
    void givenPositiveInteger_thenReturnMultiplicativePersistence() {

        long given = 999;
        int result = PersistentBugger.persistence(given);
        assertThat(result).isEqualTo(4);

        given = 39;
        result = PersistentBugger.persistence(given);
        assertThat(result).isEqualTo(3);

        given = 33;
        result = PersistentBugger.persistence(given);
        assertThat(result).isEqualTo(1);

        given = 5;
        result = PersistentBugger.persistence(given);
        assertThat(result).isZero();
    }
}
