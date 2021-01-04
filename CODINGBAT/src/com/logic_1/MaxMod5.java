package com.logic_1;
/**
 * 
 * Given two int values, return whichever value is larger. 
 * However if the two values have the same remainder when divided by 5, 
 * then the return the smaller value. However, in all cases, if the two values 
 * are the same, return 0. Note: the % "mod" operator computes the remainder, 
 * e.g. 7 % 5 is 2.


maxMod5(2, 3) → 3
maxMod5(6, 2) → 6
maxMod5(3, 2) → 3

 * 
 * @author rdarshan
 *
 */
public class MaxMod5 {

	public static void main(String[] args) {

		int a = 3, b = 2;
		System.out.println(maxMod5(a, b));
		
	}

	private static int maxMod5(int a, int b) {
		
		boolean sameRemainder = (a % 5 == b % 5);
		
		if(sameRemainder && a != b) {
			
			return (a > b)? b : a;
			
		} 
		
		return (a == b)? 0 : (a > b)? a : b;
		
	}

}
