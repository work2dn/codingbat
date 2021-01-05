package com.string_2;

/**
 * 
 * Return true if the string "cat" and "dog" appear the same number of times in 
 * the given string.


catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true

 * 
 * @author rdarshan
 *
 */
public class CatDog {

	public static void main(String[] args) {

		String str = "1cat1cadodog";
		System.out.println(catDog(str));
		
	}

	private static boolean catDog(String str) {
		
		int countCat = 0, countDog = 0;
		
		for(int i=0; i<str.length() - 2; i++) {
			
			countCat = (str.substring(i, i+3).equals("cat"))? ++countCat : countCat;
			countDog = (str.substring(i, i+3).equals("dog"))? ++countDog : countDog;

		}
		
		return countCat == countDog;
		
	}

}
