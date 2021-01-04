package com.logic_1;
/**
 * 
 * Given three ints, a b c, return true if they are in strict increasing order, 
 * such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception 
 * that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.


inOrderEqual(2, 5, 11, false) → true
inOrderEqual(5, 7, 6, false) → false
inOrderEqual(5, 5, 7, true) → true


 * 
 * @author rdarshan
 *
 */
public class InOrderEqual {

	public static void main(String[] args) {

		int a = 5,  b = 5,  c = 7;
		
		boolean equalOk = true;
		
		System.out.println(inOrderEqual(a, b, c, equalOk));
		
		
	}

	private static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {

		if(!equalOk && c > b && b > a) {
			
			return true;
			
		} else if(equalOk && c >= b && b >= a) {
			
			return true;
			
		}
			
		return false;
		
	}

}
