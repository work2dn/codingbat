package com.string_1;

/**
 * Given 2 strings, return their concatenation, except omit the first char of each. 
 * The strings will be at least length 1.


nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"

 * 
 * @author rdarshan
 *
 */
public class NonStart {

	public static void main(String[] args) {

		String a = "Hello", b = "There";
		System.out.println(nonStart(a, b));
		
	}

	private static String nonStart(String a, String b) {

		return a.substring(1) + b.substring(1);
		
	}

}
