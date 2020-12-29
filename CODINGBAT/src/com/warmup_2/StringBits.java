package com.warmup_2;

/**
 * Given a string, return a new string made of every other char starting with the 
 * first, so "Hello" yields "Hlo".


stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"

 * 
 * @author rdarshan
 *
 */
public class StringBits {

	public static void main(String[] args) {

		
		String str = "Heeololeo";
		
		System.out.println(stringBits(str));
		
	}

		private static String stringBits(String str) {
			
			String result = "";
			
			for(int i=0; i<str.length(); i+=2) {
				
				result = result + str.charAt(i);
				
				/*
				 * codingbat
				 * 
				 * result = result + str.substring(i, i+1);
				 */
				
			}
			
			return result;
			
		}

}
