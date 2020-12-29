package com.string_1;
/**
 * 
 * Given a string, return a "rotated right 2" version where the last 2 chars 
 * are moved to the start. The string length will be at least 2.


right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
 * 
 * @author rdarshan
 *
 */
public class Right2 {

	public static void main(String[] args) {

		String str = "Hello";
		System.out.println(right2(str));
		
	}

	private static String right2(String str) {

		return (str+str).substring(str.length() - 2, str.length() - 2 + str.length());
		
	}

}
