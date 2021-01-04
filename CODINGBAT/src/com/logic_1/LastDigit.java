package com.logic_1;

/**
 * 
 * Given three ints, a b c, return true if two or more of them have the same 
 * rightmost digit. The ints are non-negative. Note: the % "mod" operator 
 * computes the remainder, e.g. 17 % 10 is 7.


lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true

 * 
 * @author rdarshan
 *
 */
public class LastDigit {

	public static void main(String[] args) {

		int a = 23, b = 19, c = 3;
		System.out.println(lastDigit(a, b, c));
		
	}

	private static boolean lastDigit(int a, int b, int c) {
		
		int count = 0;
		
		int lastDigitA = a % 10;
		int lastDigitB = b % 10;
		int lastDigitC = c % 10;
		
		count = (lastDigitA == lastDigitB)? ++count: count;
		count = (lastDigitB == lastDigitC)? ++count: count;
		count = (lastDigitC == lastDigitA)? ++count: count;
		
		return (count >= 1);
		
	}

}
