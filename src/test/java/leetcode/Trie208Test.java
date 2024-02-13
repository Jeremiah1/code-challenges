package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Trie208Test {

    @Test
    void givenWord_whenWordInserted_thenSearchReturnsTrue() {
        Trie208 trie = new Trie208();
        String given = "coupling";
        trie.insert(given);

        boolean result = trie.search(given);
        assertThat(result).isTrue();
    }

    @Test
    void givenWordDoesntExist_thenWordSearchReturnsFalse() {
        Trie208 trie = new Trie208();
        String given = "coupling";

        boolean result = trie.search(given);
        assertThat(result).isFalse();
    }

    @Test
    void givenIncompleteWord_whenSearch_returnsFalse() {
        Trie208 trie = new Trie208();
        String given = "coupling";
        trie.insert(given);

        boolean result = trie.search("coup");
        assertThat(result).isFalse();
    }

    @Test
    void givenWordPrefixExists_thenStartsWithReturnsTrue() {
        Trie208 trie = new Trie208();
        String given = "dependency";
        trie.insert(given);

        boolean result = trie.startsWith("depend");
        assertThat(result).isTrue();
    }

    @Test
    void givenWordPrefixDoesntExist_thenStartsWithReturnsFalse() {
        Trie208 trie = new Trie208();
        String given = "dependency";
        trie.insert(given);

        boolean result = trie.startsWith("dependent");
        assertThat(result).isFalse();
    }
}