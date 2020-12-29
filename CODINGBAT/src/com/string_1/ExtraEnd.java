package com.string_1;

/**
 * 
 Given a string, return a new string made of 3 copies of the last 2 chars of the 
 original string. The string length will be at least 2.


extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"

 *
 */
public class ExtraEnd {

	public static void main(String[] args) {
		
		String str = "Hello";
		System.out.println(extraEnd(str));
		
	}

	private static String extraEnd(String str) {
		
		String last2char = str.substring(str.length() - 2);
		
		return last2char + last2char +last2char;
		
	}

}
