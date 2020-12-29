package com.string_1;
/**
 * 
 * Given two strings, append them together (known as "concatenation") and 
 * return the result. However, if the strings are different lengths, omit chars 
 * from the longer string so it is the same length as the shorter string. 
 * So "Hello" and "Hi" yield "loHi". The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"

 * 
 * @author rdarshan
 *
 */
public class MinCat {

	public static void main(String[] args) {

		String a = "Hello", b = "java";
		System.out.println(minCat(a, b));
		
	}

	private static String minCat(String a, String b) {

		boolean aLarger = (a.length() > b.length())? true : false;
		return (aLarger) ? a.substring(a.length() - b.length()) + b : a + b.substring(b.length() - a.length());
		
	}

}
