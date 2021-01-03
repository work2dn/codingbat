package com.logic_1;

/**
 * Return true if the given non-negative number is a multiple of 3 or 5, but 
 * not both. Use the % "mod" operator -- see Introduction to Mod


old35(3) → true
old35(10) → true
old35(15) → false

 *
 * 
 * @author rdarshan
 *
 */

public class Medium_Old35 {

	public static void main(String[] args) {

		int n = 8;
		System.out.println(old35(n));
		
	}

	private static boolean old35(int n) {
		
		boolean multiple3, multiple5;
		
		multiple3 = (n % 3 == 0);
		multiple5 = (n % 5 == 0);
				
		return !(multiple3 == multiple5);
		
	}

}
