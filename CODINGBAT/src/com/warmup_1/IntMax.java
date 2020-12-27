package com.warmup_1;

/**
 * 
 * Given three int values, a b c, return the largest.


intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3

 * @author rdarshan
 *
 */
public class IntMax {

	public static void main(String[] args) {

		int a = 1, b = 2, c = 3;
		System.out.println(intMax(a, b, c));
		
	}

	private static int intMax(int a, int b, int c) {
		
		int maxab = Math.max(a, b);
		
		int maxabc = Math.max(maxab, c);
		
		
		return maxabc;
		
		/*
		 * Below is a codingbat solution:
		 * 
		 	
		  int max;
  
		  // First check between a and b
		  if (a > b) {
		    max = a;
		  } else {
		    max = b;
		  }
		  
		  // Now check between max and c
		  if (c > max) {
		    max = c;
		  }
		  
		  return max;
		 */
	}

}
