package com.string_1;

/**
 * 
 Given a string, return a version without both the first and last char of the string. 
 The string may be any length, including 0.


withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""

 * @author rdarshan
 *
 */
public class WithouEnd2 {

	public static void main(String[] args) {

		String str = "abc";
		System.out.println(withouEnd2(str));
		
	}

	private static String withouEnd2(String str) {
		
		if(str.length() < 2) return "";
		
		return str.substring(1, str.length() - 1);
		
	}

}
