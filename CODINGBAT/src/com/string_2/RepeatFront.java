package com.string_2;
/**
 * 
 * Given a string and an int n, return a string made of the first n characters of 
 * the string, followed by the first n-1 characters of the string, and so on. 
 * You may assume that n is between 0 and the length of the string, 
 * inclusive (i.e. n >= 0 and n <= str.length()).


repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"

 * 
 * @author rdarshan
 *
 */
public class RepeatFront {

	public static void main(String[] args) {

		String str = "Chocolate";
		
		int n = 4;
		
		System.out.println(repeatFront(str, n));
		
	}

	private static String repeatFront(String str, int n) {
		
		String result = "";
		
		while(n > 0) {
			
			result += str.substring(0, n);
			
			n--;
			
		}
		
		return result;
		
	}

}
