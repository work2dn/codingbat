package com.logic_2;

/**
 * 
 * We want make a package of goal kilos of chocolate.
 * 
 * We have small bars (1 kilo each) and big bars (5 kilos each).
 * 
 * Return the number of small bars to use, assuming we always use big bars
 * before small bars.
 * 
 * Return -1 if it can't be done.
 * 
 * 
 * makeChocolate(4, 1, 9) → 4 
 * makeChocolate(4, 1, 10) → -1 
 * makeChocolate(4, 1, 7 ) → 2 
 * makeChocolate(1, 2, 6) → 1
 * 
 * 
 * 
 * @author rdarshan
 *
 */

public class Medium_MakeChocolate {

	public static void main(String[] args) {

		int small = 4, big = 1, goal = 7;

		System.out.println(makeChocolate(small, big, goal));
		System.out.println(makeChocolateInternet(small, big, goal));
		System.out.println(makeChocolateInternet2nd(small, big, goal));



	}

	private static int makeChocolate(int small, int big, int goal) {

		int smallN = goal % 5;
		int bigN = goal / 5;
		int rem = -1;

		if (bigN <= big) {

			if (smallN <= small) {

				rem = smallN;

			} else {

				rem = -1;
			}

			return rem;

		} else if (big * 5 < goal && small >= (goal - big * 5)) {

			rem = (goal - big * 5);

			return rem;

		}

		return rem;

	}

	private static int makeChocolateInternet(int small, int big, int goal) {

		if (goal >= 5) {
			if (goal / 5 >= big) {
				goal -= big * 5;
			} else {
				goal = goal % 5;
			}
		}
		if (goal <= small)
			return goal;
		return -1;

	}
	
	private static int makeChocolateInternet2nd(int small, int big, int goal) {

	  int rem = goal % 5;
	     
	  if (small + (big*5) < goal) {
		  
		  return -1;
		  
	  } else if (rem <= small && goal - big*5 > 4) {
		  
		  return rem + 5;
		  
	  } else if (rem <= small) {
		  
		  return rem;
		  
	  } else {
		  
		  return -1;
		  
	  }
	    
	}


}
