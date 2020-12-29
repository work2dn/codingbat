package com.string_1;
/**
 
 Given a string, return a string length 2 made of its first 2 chars. 
 If the string length is less than 2, use '@' for the missing chars.


atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"

 * 
 * @author rdarshan
 *
 */
public class AtFirst {

	public static void main(String[] args) {

		String str = "";
		System.out.println(atFirst(str));
		
	}

	private static String atFirst(String str) {
		
		if(str.length() >= 2) {
			
			return str.substring(0, 2);
			
		} else if(str.length() == 1) {
			
			return str + "@";
		}
		
		return "@@";
		
	}

}
