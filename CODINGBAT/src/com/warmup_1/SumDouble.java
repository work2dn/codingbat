package com.warmup_1;

/**
 * Given two int values, return their sum. Unless the two values are the 
 * same, then return double their sum.


sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8

 * @author rdarshan
 *
 */
public class SumDouble {

	public static void main(String[] args) {

		int a = 3, b = 2;
		System.out.println(sumDouble(a, b));
		
	}

	private static int sumDouble(int a, int b) {

		return (a==b)? 2*(a+b) : a+b;
		
	}

}
