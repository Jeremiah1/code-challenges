package leetcode;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

// https://leetcode.com/problems/longest-common-prefix/description/
// Problem 14: Longest Common Prefix
// Tags: Trie, Prefix Tree
public class LongestCommonPrefix14 {

    private LongestCommonPrefix14(){}

    public static String longestCommonPrefix(String[] strings){

        Trie trie = new Trie();
        Arrays.stream(strings).forEach(trie::insert);

        return trie.longestCommonPrefix();
    }

    private static class Trie {

        public TrieNode root;

        public Trie(){
            root = new TrieNode();
        }

        public void insert(String word){
            TrieNode current = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if(!current.children.containsKey(c)){
                    current.children.put(c, new TrieNode());
                }
                current = current.children.get(c);
            }
            current.isWord = true;
        }

        public String longestCommonPrefix(){

            Deque<TrieNode> stack = new LinkedList<>();
            stack.push(root);

            String longestPrefix = "";
            while(stack.size() == 1){
                TrieNode current = stack.pop();
                if(current.children.size() > 1 || current.isWord) break;

                for(Entry<Character, TrieNode> child : current.children.entrySet()){
                    longestPrefix += child.getKey();
                    stack.push(child.getValue());
                }
            }

            return longestPrefix;
        }
    }

    private static class TrieNode {

        public boolean isWord;
        public Map<Character, TrieNode> children;

        public TrieNode(){
            isWord = false;
            children = new HashMap<>();
        }
    }
}
