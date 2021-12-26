package codewars.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java
// Jaden Casing Strings
public class JadenCase {

	public String toJadenCase(String phrase) {
    
		if(phrase == null || phrase == "") return null;
		
		String[] words = phrase.split("\\s+");
		String capsPhrase = Arrays.stream(words).map(word -> {
		  if(word.charAt(0) >= 'a' && word.charAt(0) <= 'z'){
			word = word.substring(0, 1).toUpperCase() + word.substring(1);
		  }
		  return word;
		})
		.collect(Collectors.joining(" "));
		
		return capsPhrase;
	  }
}
