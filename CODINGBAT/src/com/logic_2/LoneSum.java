package com.logic_2;

/**
 * 
 * Given 3 int values, a b c, return their sum. However, if one of the values is
 * the same as another of the values, it does not count towards the sum.
 * 
 * loneSum(1, 2, 3) → 6 loneSum(3, 2, 3) → 2 loneSum(3, 3, 3) → 0
 * 
 * 
 * 
 * @author rdarshan
 *
 */
public class LoneSum {

	public static void main(String[] args) {

		int a = 3, b = 3, c = 3;
		System.out.println(loneSum(a, b, c));
		System.out.println(loneSumCB(a, b, c));

	}

	private static int loneSumCB(int a, int b, int c) {

		int sum = 0;
		if (a != b && a != c) {
			sum += a;
		}
		if (b != a && b != c) {
			sum += b;
		}
		if (c != a && c != b) {
			sum += c;
		}
		return sum;

	}

	private static int loneSum(int a, int b, int c) {

		if (a != b && b != c && c != a) {

			return a + b + c;

		} else if (a == b && b != c) {

			return c;

		} else if (b == c && a != c) {

			return a;

		} else if (a == c && a != b) {

			return b;

		}

		return 0;

	}

}
