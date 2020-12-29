package com.string_1;
/**
 * Given a string and an index, return a string length 2 starting at the given index. 
 * If the index is too big or too small to define a string length 2, use the first 2 
 * chars. The string length will be at least 2.


twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"

 * 
 * @author rdarshan
 *
 */
public class TwoChar {

	public static void main(String[] args) {

		String str  = "java";
		int index = 3;
		System.out.println(twoChar(str, index));
		
	}

	private static String twoChar(String str, int index) {
		
		int len  = index + 2;
		
		return (len > str.length() || index < 0)? str.substring(0, 2) : str.substring(index, len);
		
	}

}
