package com.warmup_1;

/**
 * Given an int n, return the absolute difference between n and 21, 
 * except return double the absolute difference if n is over 21.


diff21(19) → 2
diff21(10) → 11
diff21(21) → 0

 * @author rdarshan
 *
 */
public class Diff21 {

	public static void main(String[] args) {

		int n = 21;
		System.out.println(diff21(n));
		
	}

	private static int diff21(int n) {

		return (n > 21)? 2*(n - 21) : 21 - n;
		
	}

}
