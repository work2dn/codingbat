package com.string_1;
/**
 * Given a string, return true if "bad" appears starting at index 0 or 1 in the 
 * string, such as with "badxxx" or "xbadxx" but not "xxbadxx". 
 * The string may be any length, including 0. 
 * 
 * Note: use .equals() to compare 2 strings.


hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
 * 
 * @author rdarshan
 *
 */
public class HasBad {

	public static void main(String[] args) {

		String str = "badxx";
		System.out.println(hasBad(str));
		System.out.println(hasBadBetter(str));
	}

	private static boolean hasBadBetter(String str) {
		
		if(str.length() >=3 && str.substring(0, 3).equals("bad")) return true;
		
		if(str.length() >=4 && str.substring(1, 3).equals("bad")) return true;
		
		 return false;
		  // Solution notes: basically want to call substring(0, 3) and
		  // substring(1, 4) and check if that equals "bad". Need to check
		  // the length first so as to not go off the end of the string.
		  // Alternately one could use indexOf() -- that code is short
		  // but it runs much slower, since it needlessly checks over the whole
		  // string.
	}

	private static boolean hasBad(String str) {
		
		if(str.length() < 3) return false;
		
		return (str.indexOf("bad") == 0 || str.indexOf("bad") == 1)? true : false;
		
	}

}
