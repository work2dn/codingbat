package com.string_2;
/**
 * Given a string, does "xyz" appear in the middle of the string? To define middle, 
 * we'll say that the number of chars to the left and right of the "xyz" must 
 * differ by at most one. This problem is harder than it looks.


xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false

 * 
 * @author rdarshan
 *
 */
public class XyzMiddle {

	public static void main(String[] args) {

		String str  = "AAxyzBB";
		System.out.println(xyzMiddle(str));
		
	}

	private static boolean xyzMiddle(String str) {
		
		// check first whether 'xyz' appears in the string or not
		for(int i=0; i<str.length() - 2; i++) {
			
			// str.substring(i, i+3).equals("xyz")
			if(str.charAt(i) == 'x' && str.charAt(i+1) == 'y'  && str.charAt(i+2) == 'z') {
				
				int leftWdCharlen = i;
				int rightWdCharLen = str.length() - 1 - (i+2); 
				
				// check whether it is in the middle OR not
				if(Math.abs(leftWdCharlen - rightWdCharLen) <=1) {
					
					return true;
					
				}
				
			}
			
		}
		
		return false;
		
	}

}
