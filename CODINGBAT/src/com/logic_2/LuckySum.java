package com.logic_2;

/**
 * 
Given 3 int values, a b c, return their sum. However, if one of the values is 13 
then it does not count towards the sum and values to its right do not count.
So for example, if b is 13, then both b and c do not count.

luckySum(1, 2, 3) → 6
luckySum(1, 2, 13) → 3
luckySum(1, 13, 3) → 1

 * 
 * @author rdarshan
 *
 */
public class LuckySum {

	public static void main(String[] args) {

		int a = 1, b = 2, c = 3;
		System.out.println(luckySum(a, b, c));
		
	}

	private static int luckySum(int a, int b, int c) {
		
		if(a == 13) return 0;
		
		if(b == 13) return a;
		
		if(c == 13) return a + b;
		
		return a + b + c;
		
	}

}
