package codewars.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java
// Problem: Jaden Casing Strings
public class JadenCase {

	private JadenCase(){}
	
	public static String toJadenCase(String phrase) {
    
		if(phrase == null || phrase.isBlank()) return null;
		
		String[] words = phrase.split("\\s+");

		return Arrays.stream(words).map(word -> {
		  if(word.charAt(0) >= 'a' && word.charAt(0) <= 'z'){
			word = word.substring(0, 1).toUpperCase() + word.substring(1);
		  }
		  return word;
		})
		.collect(Collectors.joining(" "));
	  }
}
