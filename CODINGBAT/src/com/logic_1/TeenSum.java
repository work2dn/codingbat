package com.logic_1;
/**
 * 
 * Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19
 * inclusive, are extra lucky. So if either value is a teen, just return 19.


teenSum(3, 4) → 7
teenSum(10, 13) → 19
teenSum(13, 2) → 19

 * 
 * @author rdarshan
 *
 */
public class TeenSum {

	public static void main(String[] args) {

		int a = 3, b = 4;
		System.out.println(teenSum(a, b));
		
	}

	private static int teenSum(int a, int b) {

		return ((a <= 19 && a >= 13) || (b <= 19 && b >= 13))? 19 : a+b;
		
	}

}
