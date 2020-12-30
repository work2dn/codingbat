package com.logic_1;

/**
 * 
 * When squirrels get together for a party, they like to have cigars. 
 * A squirrel party is successful when the number of cigars is between 40 and 60, 
 * inclusive. 
 * 
 * Unless it is the weekend, in which case there is no upper bound on 
 * the number of cigars. 
 * 
 * Return true if the party with the given values is successful,
 *  or false otherwise.


cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true

 * 
 * @author rdarshan
 *
 */
public class CigarParty_ReadInlineComment {

	public static void main(String[] args) {

		int cigars = 70;
		boolean isWeekend = true;
		
		System.out.println(cigarParty(cigars, isWeekend));
		
	}

	
	private static boolean cigarParty(int cigars, boolean isWeekend) {
		
		// in boolean values not need to write  below:
		// return (cigars >= 40 && cigars <=60)? true : false;
		// as return only "(cigars >= 40 && cigars <=60)"
		
		if(!isWeekend) {
			
			return (cigars >= 40 && cigars <=60);
			
		} else {
			
			return (cigars >= 40);
			
		}
		
	}

}
