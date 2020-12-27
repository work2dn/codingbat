package com.warmup_1;

/**
 * 
 * Given two temperatures, return true if one is less than 0 and the other is 
 * greater than 100.


icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
	
 * 
 * @author rdarshan
 *
 */
public class IcyHot {

	public static void main(String[] args) {
		int temp1 = 120;
		int temp2 = -1;
		
		System.out.println(icyHot(temp1, temp2));
		
	}

	private static boolean icyHot(int temp1, int temp2) {

		return ((temp1 > 100 && temp2 < 0) || (temp2 > 100 && temp1 < 0))? true:false;
	
	}

}
