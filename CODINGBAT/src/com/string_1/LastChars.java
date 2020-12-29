package com.string_1;
/**
 * Given 2 strings, a and b, return a new string made of the first char of a and 
 * the last char of b, so "yo" and "java" yields "ya". If either string is length 0, 
 * use '@' for its missing char.


lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"

 * 
 * @author rdarshan
 *
 */
public class LastChars {

	public static void main(String[] args) {
		
		String a = "yo", b = "java";
		System.out.println(lastChars(a, b));
		
	}

	private static String lastChars(String a, String b) {
		String firstCharA = (a.length() > 0) ? a.substring(0, 1) : "@";
		String lastCharB = (b.length() > 0) ? b.substring(b.length() - 1) : "@";

		return firstCharA + lastCharB;
		
	}

}
