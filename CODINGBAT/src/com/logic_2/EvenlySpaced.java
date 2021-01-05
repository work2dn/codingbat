package com.logic_2;

/**
 * Given three ints, a b c, one of them is small, one is medium and one is
 * large. Return true if the three values are evenly spaced, so the difference
 * between small and medium is the same as the difference between medium and
 * large.
 * 
 * 
 * evenlySpaced(2, 4, 6) → true evenlySpaced(4, 6, 2) → true evenlySpaced(4, 6,
 * 3) → false
 * 
 * @author rdarshan
 *
 */
public class EvenlySpaced {

	public static void main(String[] args) {

		int a = 4, b = 6, c = 3;

		System.out.println(evenlySpaced(a, b, c));
		System.out.println(evenlySpacedInternet(a, b, c));

	}

	private static boolean evenlySpaced(int a, int b, int c) {

		int small = 0, medium = 0, large = 0;

		if (a >= b && a >= c) {

			large = a;

			if (b >= c) {

				medium = b;
				small = c;

			} else {

				medium = c;
				small = b;

			}

		}

		if (b >= c && b >= a) {

			large = b;

			if (c >= a) {

				medium = c;
				small = a;

			} else {

				medium = a;
				small = c;

			}

		}

		if (c >= b && c >= a) {

			large = c;

			if (b >= a) {

				medium = b;
				small = a;

			} else {

				medium = a;
				small = b;

			}

		}

		int lm = large - medium;
		int ms = medium - small;

		return (lm == ms);

	}

	public static boolean evenlySpacedInternet(int a, int b, int c) {
		int temp;
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}

		if (b > c) {
			temp = b;
			b = c;
			c = temp;
		}

		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}

		return b - a == c - b;

	}

}
