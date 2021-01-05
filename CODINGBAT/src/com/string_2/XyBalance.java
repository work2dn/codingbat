package com.string_2;

/**
 * 
 * We'll say that a String is xy-balanced if for all the 'x' chars in the string, 
 * there exists a 'y' char somewhere later in the string. So "xxy" is balanced, 
 * but "xyx" is not. One 'y' can balance multiple 'x's. 
 * 
 * Return true if the given string is xy-balanced.


xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false

 * 
 * @author rdarshan
 *
 */
public class XyBalance {

	public static void main(String[] args) {

		String str = "bxyb";
		System.out.println(xyBalance(str));
		System.out.println(xyBalanceCB(str));

	}

	private static boolean xyBalance(String str) {
		
		int indexX = -1, indexY = -1;
		int len = str.length();
		
		while(len > 0) {
			
			if(str.charAt(len - 1) == 'x') {
				
				indexX = (len - 1);
				
				break;
			}

			len--;
			
		}
		
		len = str.length();
		
		while(len > 0) {
			
			if(str.charAt(len - 1) == 'y') {
				
				indexY = (len - 1);
				
				break;
				
			}
			
			len--;
			
		}
		
		return (indexY > indexX) || (indexX == indexY);

	}
	
	public static boolean xyBalanceCB(String str) {
		  // Find the rightmost y
		  int y = -1;
		  for (int i = 0; i < str.length(); i++) {
		    if (str.charAt(i)=='y') y = i;
		  }
		  
		  // Look at the x's, return false if one is after y
		  for (int i = 0; i < str.length(); i++) {
		    if (str.charAt(i)=='x' && i > y) return false;
		  }
		  return true;

		  // Solution notes: this solution uses two loops, each written the simple
		  // 0..length way. You could do it with a single reverse loop, noticing
		  // if you see an x before a y. Or use lastIndexOf().
		}

}
