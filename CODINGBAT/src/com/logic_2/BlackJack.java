package com.logic_2;

/**
 * Given 2 int values greater than 0, return whichever value is nearest to 21
 * without going over. Return 0 if they both go over.
 * 
 * 
 * blackjack(19, 21) → 21 blackjack(21, 19) → 21 blackjack(19, 22) → 19
 * 
 * 
 * @author rdarshan
 *
 */

public class BlackJack {

	public static void main(String[] args) {

		int a = 19, b = 22;

		System.out.println(blackJack(a, b));
		System.out.println(blackJackCB(a,b));


	}

	private static int blackJack(int a, int b) {

		int a21 = 21 - a;

		int b21 = 21 - b;

		if (a21 < 0 && b21 < 0) {

			return 0;

		}

		if (a21 >= 0 && b21 >= 0) {

			return (a21 < b21) ? a : b;

		}

		return (a21 > 0 && b21 < 0) ? a : b;

	}

	public static int blackJackCB(int a, int b) {
		// The value of a/b, or 0 if over 21
		int aVal = a;
		if (aVal > 21) {
			aVal = 0;
		}
		int bVal = b;
		if (bVal > 21) {
			bVal = 0;
		}

		// Now it works to just return whichever is larger.
		if (aVal > bVal) {
			return aVal;
		} else {
			return bVal;
		}

		// You can write a very short version of this same strategy
		// using the "ternary operator" ?: and Math.max()
	}

}
