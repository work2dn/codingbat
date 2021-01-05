package com.string_2;
/**
 * 
 * Given two strings, a and b, create a bigger string made of the first char 
 * of a, the first char of b, the second char of a, the second char of b, and 
 * so on. Any leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"

 * 
 * @author rdarshan
 *
 */
public class MixString {

	public static void main(String[] args) {

		String a = "Hi", b = "There";
		
		System.out.println(mixString(a, b));
		
	}

	private static String mixString(String a, String b) {
		
		int len = (a.length() > b.length())? a.length() : b.length();
		
		String result = "";
		
		for(int i=0; i<len; i++) {
			
			if(i > a.length() - 1) {
				
				result += "" + b.charAt(i);
				
				continue;
				
			}
			
			if(i > b.length() - 1) {
				
				result += "" + a.charAt(i);
				
				continue;
				
			}
			
			result += a.charAt(i) + "" + b.charAt(i);
			
		}
		
		return result;
		
	}

}
