package com.logic_1;

/**
 * 
 * We'll say a number is special if it is a multiple of 11 or if it is one more 
 * than a multiple of 11. Return true if the given non-negative number is special. 
 * Use the % "mod" operator -- see Introduction to Mod


specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false

 * @author rdarshan
 *
 */
public class SpecialEleven {

	public static void main(String[] args) {

		int n = 24;
		System.out.println(specialEleven(n));
		
	}

	private static boolean specialEleven(int n) {

		return (n % 11 == 0 || n % 11 == 1);
		
	}

}
