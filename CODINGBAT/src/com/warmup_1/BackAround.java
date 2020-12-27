package com.warmup_1;

/**
 * 
 * Given a string, take the last char and return a new string with the last char 
 * added at the front and back, so "cat" yields "tcatt". 
 * The original string will be length 1 or more.


backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
 * 
 * @author rdarshan
 *
 */
public class BackAround {

	public static void main(String[] args) {

		String str = "a";
		System.out.println(backAround(str));
		
	}

	private static String backAround(String str) {
		
		if(str.length() == 0) return str;
		
		char lastChar = str.charAt(str.length() - 1);
		
		return lastChar + str + lastChar;
		
	}

}
