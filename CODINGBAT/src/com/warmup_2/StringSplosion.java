package com.warmup_2;

/**
 * 
Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"


 * @author rdarshan
 *
 */
public class StringSplosion {

	public static void main(String[] args) {

		String str = "ab";
		System.out.println(stringSplosion(str));
		
	}

	private static String stringSplosion(String str) {

		String result = "";
		
		for(int i=0; i<=str.length(); i++) {
			
			result = result + str.substring(0, i);
			
		}
		
		return result;
	}


}
