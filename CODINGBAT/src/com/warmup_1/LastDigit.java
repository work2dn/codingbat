package com.warmup_1;

/**
 * Given two non-negative int values, return true if they have the same last digit, 
 * such as with 27 and 57. Note that the % "mod" operator computes remainders, 
 * so 17 % 10 is 7.


lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true

 * 
 * @author rdarshan
 *
 */
public class LastDigit {

	public static void main(String[] args) {

		int a=3, b=113;
		System.out.println(lastDigit(a, b));
		
	}

	private static boolean lastDigit(int a, int b) {
		
		int lastDigitA = a%10;
		int lastDigitB = b%10;
		
		return lastDigitA == lastDigitB;
		
	}

}
