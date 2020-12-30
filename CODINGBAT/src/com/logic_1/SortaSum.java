package com.logic_1;

/**
 * 
 * Given 2 ints, a and b, return their sum. However, sums in the range 10..19 
 * inclusive, are forbidden, so in that case just return 20.


sortaSum(3, 4) → 7
sortaSum(9, 4) → 20
sortaSum(10, 11) → 21

 * @author rdarshan
 *
 */
public class SortaSum {

	public static void main(String[] args) {

		int a = 10, b = 11;
		
		System.out.println(sortaSum(a, b));
		
	}

	private static int sortaSum(int a, int b) {

		return (a+b >= 10 && a+b <= 19)? 20 : a+b;
		
	}

}
