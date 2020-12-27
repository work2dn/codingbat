package com.warmup_1;

/**
 * Given 2 int values, return true if one is negative and one is positive. 
 * Except if the parameter "negative" is true, then return true only if 
 * both are negative.


posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true

 * @author rdarshan
 *
 */
public class PosNeg {

	public static void main(String[] args) {
		
		int a = -4, b = -5;
		boolean negative = true;
		
		System.out.println(posNeg(a, b, negative));
		
	}

	private static boolean posNeg(int a, int b, boolean negative) {

		return (!negative && a > 0 && b < 0 ) || (!negative && a < 0 && b > 0) || (negative &&  a < 0 && b < 0);
		
	}

}
