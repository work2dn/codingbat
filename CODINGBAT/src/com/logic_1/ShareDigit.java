package com.logic_1;
/**
 * Given two ints, each in the range 10..99, return true if there is a digit 
 * that appears in both numbers, such as the 2 in 12 and 23. 
 * (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives 
 * the right digit.)


shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false

 * 
 * @author rdarshan
 *
 */
public class ShareDigit {

	public static void main(String[] args) {

		int a = 12, b = 44;
		System.out.println(shareDigit(a , b));
		
	}

	private static boolean shareDigit(int a, int b) {
		
		int leftA = a / 10;
		int rightA = a % 10;
		
		int leftB = b / 10;
		int rightB = b % 10;
		
		return leftA == leftB || leftA == rightB || rightA == leftB || rightA == rightB;
		
	}

}
