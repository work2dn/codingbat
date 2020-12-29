package com.string_1;
/**
Given a string and a second "word" string, we'll say that the word matches the 
string if it appears at the front of the string, except its first char does not 
need to match exactly. On a match, return the front of the string, or otherwise 
return the empty string. So, so with the string "hippo" the word "hi" returns "hi" 
and "xip" returns "hip". The word will be at least length 1.


startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"

 * 
 * @author rdarshan
 *
 */
public class StartWord {

	public static void main(String[] args) {

		String str = "hippo";
		String word = "i";
		
		System.out.println(startWord(str, word));
		
	}

	private static String startWord(String str, String word) {
		
		if(str.length() < word.length()) return "";
		
		if(word.length() == 1) {
			
			return str.substring(0, 1);
			
		} else {
			
			return (word.substring(1).equals(str.substring(1, word.length())))? str.substring(0, word.length()): "";
			
		}
		
	}

}
