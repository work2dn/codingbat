package com.string_1;

/**
 * 
 * Given 2 strings, a and b, return a string of the form short+long+short, with 
 * the shorter string on the outside and the longer string on the inside. 
 * The strings will not be the same length, but they may be empty (length 0).


comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"

 * 
 * @author rdarshan
 *
 */
public class ComboString {

	public static void main(String[] args) {

		String a = "Hello", b = "hi";
		System.out.println(comboString(a, b));
		
	}

	private static String comboString(String a, String b) {
		
		return (a.length() > b.length())? b + a + b: a + b + a;
		
	}

}
