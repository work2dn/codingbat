package com.string_2;

/**
 * Given a string, return a string where for every char in the original, there are
 *  two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"

 * 
 * @author rdarshan
 *
 */
public class DoubleChar {

	public static void main(String[] args) {

		String str = "The";
		System.out.println(doubleChar(str));
		
	}

	private static String doubleChar(String str) {
		
		StringBuffer sb = new StringBuffer();
		
		//String result = "";
		
		for(int i=0; i<str.length(); i++) {
			
			sb.append(str.charAt(i)).append(str.charAt(i));
			//result = result + str.substring(i, i+1) + str.substring(i, i+1);
		 
		}
			
		return sb.toString();
		
	}

}
