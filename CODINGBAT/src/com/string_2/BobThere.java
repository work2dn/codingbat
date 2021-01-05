package com.string_2;
/**
 * Return true if the given string contains a "bob" string, but where 
 * the middle 'o' char can be any char.


bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false

 * 
 * @author rdarshan
 *
 */
public class BobThere {

	public static void main(String[] args) {

		String str = "bac";
		System.out.println(bobThere(str));
		
	}

	private static boolean bobThere(String str) {
		
		if(str.length() >= 3 && str.charAt(0) == 'b' && str.charAt(2) == 'b') return true;
		
		for(int i=1; i<str.length() - 2; i++) {
			
			if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b') return true;
			
		}
		
		return false;
		
	}

}
