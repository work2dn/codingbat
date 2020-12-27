package com.warmup_1;

/**
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
 * Given 2 int values, return true if one or the other is teen, but not both.


loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
 * 
 * @author rdarshan
 *
 */
public class Medium_LoneTeen {

	public static void main(String[] args) {

		int a = 99;
		int b = 99;
		
		System.out.println(loneTeen(a, b));
		
	}

	private static boolean loneTeen(int a, int b) {
		
		boolean aTeen = (a >= 13 && a <= 19);
		boolean bTeen = (b >=13 && b <= 19);
		
		
		return (aTeen && !bTeen) || (!aTeen && bTeen);
		
	}

}
