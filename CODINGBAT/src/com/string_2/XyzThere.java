package com.string_2;

/**
 * 
 * Return true if the given string contains an appearance of "xyz" where the xyz
 * is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does
 * not.
 * 
 * 
 * xyzThere("abcxyz") → true 
 * xyzThere("abc.xyz") → false 
 * xyzThere("xyz.abc") → true
 * 
 * 
 * @author rdarshan
 *
 */
public class XyzThere {

	public static void main(String[] args) {

		String str = "abc.xyz";
		System.out.println(xyzThere(str));
		System.out.println(xyzThereBetter(str));

	}
	
	

	private static boolean xyzThereBetter(String str) {
		
		if(str.length() >= 3 && str.substring(0, 3).equals("xyz")) {
			
			return true;
			
		}
		
		for(int i=1; i<str.length() - 2; i++) {
			
			if(str.charAt(i - 1) != '.' && str.substring(i, i+3).equals("xyz")) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}



	private static boolean xyzThere(String str) {
		
		if(str.length() == 3 && str.charAt(0) == 'x' && str.charAt(1) == 'y'
				&& str.charAt(2) == 'z') return true;

		for (int i = 0; i < str.length() - 3; i++) {
			
			if(i == 0) {
				
				if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y'
						&& str.charAt(i + 2) == 'z') return true;
				
			}
			
			if((str.charAt(i) != '.' && str.charAt(i + 1) == 'x' && str.charAt(i + 2) == 'y'
					&& str.charAt(i + 3) == 'z')) return true;

		}
		
		return false;
	}

}
