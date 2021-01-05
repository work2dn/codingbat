package com.string_2;
/**
 * 
 * Given a string and an int n, return a string made of n repetitions of the 
 * last n characters of the string. You may assume that n is between 0 and 
 * the length of the string, inclusive.


repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"

 * 
 * @author rdarshan
 *
 */
public class RepeatEnd {

	public static void main(String[] args) {

		String str = "Hello";
		
		int n = 1;
		
		System.out.println(repeatEnd(str, n));
		
	}

	private static String repeatEnd(String str, int n) {
		
		String result = "";
		
		int lastN = n;
		
		while(n > 0) {
			
			result += str.substring(str.length() - lastN);
			
			n--;
			
		}
		
		return result;
		
	}

}
