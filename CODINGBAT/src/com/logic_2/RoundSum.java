package com.logic_2;

/**
 * 
 * For this problem, we'll round an int value up to the next multiple of 10 if
 * its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round
 * down to the previous multiple of 10 if its rightmost digit is less than 5, so
 * 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded
 * values. To avoid code repetition, write a separate helper "public int
 * round10(int num) {" and call it 3 times. Write the helper entirely below and
 * at the same indent level as roundSum().
 * 
 * 
 * roundSum(16, 17, 18) → 60 
 * roundSum(12, 13, 14) → 30 
 * roundSum(6, 4, 4) → 10
 * 
 * 
 * @author rdarshan
 *
 */
public class RoundSum {

	public static void main(String[] args) {

		int a = 6, b = 4, c = 4;

		System.out.println(0 / 10 + "__");
		System.out.println(roundSum(a, b, c));

	}

	private static int roundSum(int a, int b, int c) {

		return round10(a) + round10(b) + round10(c);

	}

	private static int round10(int a) {

		if (a == 0 || a % 10 == 0)
			return a;

		return (a % 10 < 5 && a % 10 > 0) ? (a / 10) * 10 : (a / 10 + 1) * 10;

	}

	public int round10CB(int num) {

		int remainder = num % 10;

		num -= remainder;

		if (remainder >= 5) {

			num += 10;

		}
		
		return num;
	}

}
