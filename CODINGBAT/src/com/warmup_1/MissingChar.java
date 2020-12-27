package com.warmup_1;

/**
 * Given a non-empty string and an int n, return a new string where the char at 
 * index n has been removed. The value of n will be a valid index of a char in the 
 * original string (i.e. n will be in the range 0..str.length()-1 inclusive).


missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"

 * @author rdarshan
 *
 */
public class MissingChar {

	public static void main(String[] args) {

		String str = "kitten";
		int n = 4;
		System.out.println(missingChar(str, n));
	}

	private static String missingChar(String str, int n) {

/*	
char means exactly one character. You can't assign zero characters to this type.
That means that there is no char value for which String.replace(char, char) would 
return a string with a different length.
*/
		
//		return str.replace(str.charAt(n), Character.MIN_VALUE);
		
//		char c = 0;
//		return str.replace(str.charAt(n), c);
		
		StringBuilder sb = new StringBuilder(str);
		sb.deleteCharAt(n);
		
		return sb.toString();

/*
 * Another Solution
 * 
 * String front = str.substring(0, n);
  
  // Start this substring at n+1 to omit the char.
  // Can also be shortened to just str.substring(n+1)
  // which goes through the end of the string.
   
  String back = str.substring(n+1, str.length());
  
  return front + back;
 */
	}

}
