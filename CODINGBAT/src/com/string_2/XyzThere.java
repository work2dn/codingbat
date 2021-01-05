package com.string_2;
/**
 * 
 * Return true if the given string contains an appearance of "xyz" where the
 *  xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does 
 *  not.


xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true

 * 
 * @author rdarshan
 *
 */
public class XyzThere {

	public static void main(String[] args) {

		String str = "abcxyz";
		System.out.println(xyzThere(str));
		
	}

	private static boolean xyzThere(String str) {

		return false;
		
	}

}
