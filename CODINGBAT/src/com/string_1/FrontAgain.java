package com.string_1;
/**
 * Given a string, return true if the first 2 chars in the string also appear 
 * at the end of the string, such as with "edited".


frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true

 * 
 * @author rdarshan
 *
 */
public class FrontAgain {

	public static void main(String[] args) {

		String str = "ed";
		System.out.println(frontAgain(str));
		
	}

	private static boolean frontAgain(String str) {
		
		if(str.length() < 2) return false;
		
		return (str.substring(0, 2).equals(str.substring(str.length() - 2)))? true:false;
		
	}

}
