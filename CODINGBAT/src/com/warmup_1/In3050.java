package com.warmup_1;

/**
 * Given 2 int values, return true if they are both in the range 30..40 inclusive,
 * or they are both in the range 40..50 inclusive.


in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true

 * @author rdarshan
 *
 */
public class In3050 {

	public static void main(String[] args) {

		int a=30, b=31;
		System.out.println(in3050(a, b));
		
	}

	private static boolean in3050(int a, int b) {

		return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) ||
			   ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
		
		/*
		 * Codingbat solution below:
		 
		  if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
    		return true;
  		  }
		  if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
		    return true;
		  }
		  return false;
		  // This could be written as one very large expression,
		  // connecting the two main parts with ||
		 */
	}

}
