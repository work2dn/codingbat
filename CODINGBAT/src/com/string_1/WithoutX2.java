package com.string_1;

/**
 * Given a string, if one or both of the first 2 chars is 'x', return the string 
 * without those 'x' chars, and otherwise return the string unchanged. 
 * 
 * This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"

 * 
 * @author rdarshan
 *
 */
public class WithoutX2 {

	public static void main(String[] args) {

		String str = "xHi";
		System.out.println(withoutX2(str));
		
	}

	private static String withoutX2(String str) {
		
		String firt2Char = str.substring(0, 2);
		
		
		String left = str.substring(2);
		
		
		return null;
		
	}

}
