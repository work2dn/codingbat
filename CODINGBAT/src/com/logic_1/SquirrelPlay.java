package com.logic_1;

/**
 * The squirrels in Palo Alto spend most of the day playing. 
 * In particular, they play if the temperature is between 60 and 90 (inclusive). 
 * Unless it is summer, then the upper limit is 100 instead of 90. 
 * Given an int temperature and a boolean isSummer, return true if the 
 * squirrels play and false otherwise.


squirrelPlay(70, false) → true
squirrelPlay(95, false) → false
squirrelPlay(95, true) → true

 * 
 * @author rdarshan
 *
 */
public class SquirrelPlay {

	public static void main(String[] args) {

		int temp = 70;
		boolean isSummer = false;
		
		System.out.println(squirrelPlay(temp, isSummer));
		
	}

	private static boolean squirrelPlay(int temp, boolean isSummer) {
		
		if(isSummer) {
			
			return (temp >= 60 && temp <= 100);
			
		} else {
			
			return (temp >= 60 && temp <= 90);
			
		}
	}

}
