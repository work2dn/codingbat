package com.string_1;
/**
 Given a string of even length, return a string made of the middle two chars, 
 so the string "string" yields "ri". The string length will be at least 2.


middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"

 * 
 * @author rdarshan
 *
 */
public class MiddleTwo {

	public static void main(String[] args) {

		String str = "string";
		System.out.println(middleTwo(str));
		
	}

	private static String middleTwo(String str) {

		return str.substring(str.length()/2  - 1, str.length()/2  + 1);
		
	}

}
