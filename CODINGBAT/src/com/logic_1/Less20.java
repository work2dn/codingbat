package com.logic_1;
/**
 * Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
 *  So for example 38 and 39 return true, but 40 returns false.
 * See also: Introduction to Mod


less20(18) → true
less20(19) → true
less20(20) → false
 * 
 * @author rdarshan
 *
 */
public class Less20 {

	public static void main(String[] args) {

		int n = 20;
		System.out.println(less20(n));
				
	}

	private static boolean less20(int n) {

		return (n % 20 == 19 || n % 20 == 18);
		
	}

}
