package com.warmup_2;

/**
 * 
 * Given a string and a non-negative int n, return a larger string that is n copies 
 * of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"

 * 
 * @author rdarshan
 *
 */
public class StringTimes {

	public static void main(String[] args) {
		
		String str = "Hi";
		int n = 2;
		System.out.println(strungTimes(str, n));
		
	}

	private static String strungTimes(String str, int n) {
		
		String result = "";
		
		while(n > 0) {
			
			result += str;
			
			n--;
					
		}
		
		return result;
	}

}
