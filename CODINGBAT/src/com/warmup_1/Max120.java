package com.warmup_1;

/**
 * Given 2 positive int values, return the larger value that is in the range 10..20 
 * inclusive, or return 0 if neither is in that range.


	max1020(11, 19) → 19
	max1020(19, 11) → 19
	max1020(11, 9) → 11

 * @author rdarshan
 *
 */
public class Max120 {

	public static void main(String[] args) {

		int a=11, b=19;
		System.out.println(max1020(a, b));
		
	}

	private static int max1020(int a, int b) {
		
		int largerAB = (a > b)? a : b;
		int smallerAB = (a < b)? a : b;
		
		return (largerAB >= 10 && largerAB <= 20)? largerAB : 
			   (smallerAB >= 10 && smallerAB <= 20)? smallerAB: 
				0;
		
		/*
		 * Codingbat solution below:
		 * 
		 * // First make it so the bigger value is in a
		  if (b > a) {
		    int temp = a;
		    a = b;
		    b = temp;
		  }
		  
		  // Knowing a is bigger, just check a first
		  if (a >= 10 && a <= 20) return a;
		  if (b >= 10 && b <= 20) return b;
		  return 0;
		 */
	}

}
