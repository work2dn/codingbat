package com.logic_1;

/**
 * 
 * Return the sum of two 6-sided dice rolls, each in the range 1..6. 
 * However, if noDoubles is true, if the two dice show the same value, increment 
 * one die to the next value, wrapping around to 1 if its value was 6.


withoutDoubles(2, 3, true) → 5
withoutDoubles(3, 3, true) → 7
withoutDoubles(3, 3, false) → 6

 * 
 * @author rdarshan
 *
 */
public class WithoutDoubles {

	public static void main(String[] args) {

		int die1 = 3, die2 = 3;
		boolean noDoubles = false;
		System.out.println(withoutDoubles(die1, die2, noDoubles));
		
	}

	private static int withoutDoubles(int die1, int die2, boolean noDoubles) {
		
		if(noDoubles && die1 == die2) {
			
			return (die1 == 6)? die1 + 1 : die1 + die2 + 1;
			
		} else {
			
			return die1 + die2;
			
		}
		
		
	}

}
