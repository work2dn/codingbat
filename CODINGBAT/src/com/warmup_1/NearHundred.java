package com.warmup_1;

/**
 * Given an int n, return true if it is within 10 of 100 or 200. 
 * Note: Math.abs(num) computes the absolute value of a number.


nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false

 * @author rdarshan
 *
 */
public class NearHundred {

	public static void main(String[] args) {
		
		int n = 89;
		System.out.println(nearHundred(n));
		
	}

	private static boolean nearHundred(int n) {

		return (Math.abs(n-100) <= 10 || Math.abs(n-200) <= 10);
	}

}
