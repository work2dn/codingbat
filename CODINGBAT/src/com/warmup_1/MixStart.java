package com.warmup_1;

/**
 * 
 * Return true if the given string begins with "mix", except the 'm' can be anything, 
 * so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false

 * @author rdarshan
 *
 */

public class MixStart {

	public static void main(String[] args) {

		String str = "piz snacks";
		
		System.out.println(misStart(str));
		
	}

	private static boolean misStart(String str) {
		
		if(str.length() >= 3) {
			
			String firstThree = str.substring(0, 3);
			
			return (firstThree.substring(1).equals("ix"))? true : false;
			
		}
		
		return false;
		
	}

}
