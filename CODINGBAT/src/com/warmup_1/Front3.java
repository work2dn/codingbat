package com.warmup_1;

/**
 * 
 * Given a string, we'll say that the front is the first 3 chars of the string. 
 * If the string length is less than 3, the front is whatever is there. 
 * Return a new string which is 3 copies of the front.


front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"

 * @author rdarshan
 *
 */
public class Front3 {

	public static void main(String[] args) {

		String str = "Java";
		System.out.println(front3(str));
		
	}

	private static String front3(String str) {
		
		if(str.length() < 3) return str + str + str;
		
		String first3Char  = str.substring(0, 3);
		
		return first3Char + first3Char + first3Char;
		/*
		// in Java 11 and later
		return first3Char.repeat(3);
		
		*/
		
	}

}
