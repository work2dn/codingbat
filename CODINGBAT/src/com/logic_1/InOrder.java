package com.logic_1;

/**
 * 
 * Given three ints, a b c, return true if b is greater than a, and c is greater 
 * than b. However, with the exception that if "bOk" is true, b does not need 
 * to be greater than a.


inOrder(1, 2, 4, false) → true
inOrder(1, 2, 1, false) → false
inOrder(1, 1, 2, true) → true

 * 
 * @author rdarshan
 *
 */
public class InOrder {

	public static void main(String[] args) {

		int a = 1, b = 1, c = 2;
		boolean bOk = true;
		
		System.out.println(inOrder(a, b, c, bOk));
		
	}

	private static boolean inOrder(int a, int b, int c, boolean bOk) {

		if(!bOk && b >a && c > b) {
			
			return true;
			
		} else if(bOk && c > b) {
			
			return true;
			
		}
		
		return false;
		
	}

}
