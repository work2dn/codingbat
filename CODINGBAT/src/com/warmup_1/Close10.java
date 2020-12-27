package com.warmup_1;

/**
 * Given 2 int values, return whichever value is nearest to the value 10, 
 * or return 0 in the event of a tie. Note that Math.abs(n) returns the 
 * absolute value of a number.


close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0

 * @author rdarshan
 *
 */
public class Close10 {

	public static void main(String[] args) {

		int a = 13, b = 7;
		System.out.println(close10(a, b));
		
	}

	private static int close10(int a, int b) {

		if(Math.abs(a - 10) == Math.abs(b - 10)) return 0;
		
		return (Math.abs(a - 10) < Math.abs(b - 10))? a : b;
		
		/*
		 * Codingbat solution below:
		 * 	  int aDiff = Math.abs(a - 10);
			  int bDiff = Math.abs(b - 10);
			  
			  if (aDiff < bDiff) {
			    return a;
			  }
			  if (bDiff < aDiff) {
			    return b;
			  }
			  return 0;  // i.e. aDiff == bDiff
  
		 */
	}

}
