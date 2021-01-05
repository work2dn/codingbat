package com.string_2;
/**
 * 
 * Given two strings, return true if either of the strings appears at the very 
 * end of the other string, ignoring upper/lower case differences 
 * (in other words, the computation should not be "case sensitive"). 
 * Note: str.toLowerCase() returns the lowercase version of a string.


endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
 * 
 * @author rdarshan
 *
 */
public class EndOther {

	public static void main(String[] args) {

		String a = "abc", b = "abXabc";
		System.out.println(endOther(a, b));
		
	}

	private static boolean endOther(String a, String b) {
		
		int aLen = a.length();
		int bLen = b.length();
		
		if(aLen > bLen) {
			
		//	return a.substring(aLen - bLen).equalsIgnoreCase(b);
			return a.substring(aLen - bLen).toLowerCase().equals(b.toLowerCase());
			
		} else  {
	
		// 	return b.substring(bLen - aLen).equalsIgnoreCase(a);
			return b.substring(bLen - aLen).toLowerCase().equals(a.toLowerCase());
			
		}
		
	}

}
