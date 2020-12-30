package com.string_1;
/**
 * 
 Given a string of any length, return a new string where the last 2 chars, 
 if present, are swapped, so "coding" yields "codign".


lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
 * 
 * @author rdarshan
 *
 */
public class LastTwo {

	public static void main(String[] args) {

		String str = "ab";
		System.out.println(lastTwo(str));
		
	}

	private static String lastTwo(String str) {
		
		if(str.length() < 2) return str;
		
		return str.substring(0, str.length() - 2) + str.substring(str.length() - 1) + str.substring(str.length() - 2, str.length() - 1);
		
	}

}