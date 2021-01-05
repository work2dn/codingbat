package com.string_2;
/**
 * 
 * Given two strings, word and a separator sep, return a big string made of 
 * count occurrences of the word, separated by the separator string.


repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"

 * 
 * @author rdarshan
 *
 */
public class RepeatSeparator {

	public static void main(String[] args) {

		String word = "Word", sep = "X";
		int count = 3;
		
		System.out.println(repeatSeparator(word, sep, count));
		
	}

	private static String repeatSeparator(String word, String sep, int count) {
		
		String result = "";
		
		while(count > 0) {
			
			if(count == 1) {
				
				result += word;
				
			} else {
				
				result += word + sep;
				
			}
			
			count--;
			
		}
		
		return result;
		
	}

}
