package com.string_1;

/**
 * 
 * Given a string, return a version without the first and last char, so "Hello" 
 * yields "ell". The string length will be at least 2.


withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
 * 
 * @author rdarshan
 *
 */
public class WithoutEnd {

	public static void main(String[] args) {

		String str = "Hello";
		System.out.println(withoutEnd(str));
		
	}

	private static String withoutEnd(String str) {

		return str.substring(1, str.length() - 1);
		
	}

}
