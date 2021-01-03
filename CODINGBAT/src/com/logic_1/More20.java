package com.logic_1;

/**
 * 
 * Return true if the given non-negative number is 1 or 2 more than a multiple of 20. 
 * See also: Introduction to Mod


more20(20) → false
more20(21) → true
more20(22) → true
 * 
 * @author rdarshan
 *
 */
public class More20 {

	public static void main(String[] args) {
		
		int n = 22;
		System.out.println(more20(n));
		
	}

	private static boolean more20(int n) {

		return (n % 20 == 1 || n % 20 == 2);
		
	}

}
