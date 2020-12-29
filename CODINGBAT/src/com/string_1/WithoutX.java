package com.string_1;
/**
 * 
 * Given a string, if the first or last chars are 'x', return the string 
 * without those 'x' chars, and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"

 * 
 * @author rdarshan
 *
 */
public class WithoutX {

	public static void main(String[] args) {

		String str = "Hxix";
		System.out.println(withoutX(str));
		System.out.println(withoutXCB(str));
		
	}
	
	private static String withoutXCB(String str) {
		
		if(str.length() > 0 && str.charAt(0) == 'x') {
			
			str = str.substring(1);
		}
		
		if(str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
			
			str = str.substring(0, str.length() - 1);
			
		}
		
		return str;
		
		  // Solution  notes: check for the 'x' in both spots. If found, use substring()
		  // to grab the part without the 'x'. Check that the length is greater than 0
		  // each time -- the need for the second length check is tricky to see.
		  // One could .substring() instead of .charAt() to look into the string.
		}

	private static String withoutX(String str) {
		
		String result = "";
		
		if(str.length() == 0) return result;
		
		if(str.length() == 1) {
			
			return (str.equals("x"))? "" : str;
			
		} else {
			
			if(str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x' ) {
				
				return str.substring(1, str.length() - 1);
				
			} else if(str.charAt(0) == 'x' && str.charAt(str.length() - 1) != 'x' ) {
				
				return str.substring(1);
				
			} else if(str.charAt(0) != 'x' && str.charAt(str.length() - 1) == 'x' ) {
				
				return str.substring(0, str.length() - 1);
				
			} else {
				
				return str;
				
			}
		}
		
		
	}

}
