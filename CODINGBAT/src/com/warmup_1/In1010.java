package com.warmup_1;

/**
 * 
 * Given 2 int values, return true if either of them is in the range 10..20 inclusive.

in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
 * 
 * @author rdarshan
 *
 */
public class In1010 {

	public static void main(String[] args) {

		int a = 8, b = 99;
		
		System.out.println(in1020(a, b));
		
	}

	private static boolean in1020(int a, int b) {

		return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
		
	}

}
