package leetcode;

// https://leetcode.com/problems/implement-trie-prefix-tree/description/
// Problem 208: Implement Trie (Prefix Tree)
public class Trie208 {

    private TrieNode root;

    public Trie208() {
        root = new TrieNode('\0');
    }

    public void insert(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if(currentNode.children[c - 'a'] == null){
                currentNode.children[c - 'a'] = new TrieNode(c);
            }

            currentNode = currentNode.children[c - 'a'];
        }

        currentNode.isWordEnd = true;
    }

    public boolean search(String word) {

        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(current.children[c - 'a'] == null){
                return false;
            }
            current = current.children[c - 'a'];
        }
        return current.isWordEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if(current.children[c - 'a'] == null){
                return false;
            }
            current = current.children[c - 'a'];
        }
        return true;
    }

    private static class TrieNode {

        public char value;
        public boolean isWordEnd;
        public TrieNode[] children;

        public TrieNode(char c){
            this.value = c;
            isWordEnd = false;
            children = new TrieNode[26];
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
