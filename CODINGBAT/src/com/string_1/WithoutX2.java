package com.string_1;

/**
 * Given a string, if one or both of the first 2 chars is 'x', return the string 
 * without those 'x' chars, and otherwise return the string unchanged. 
 * 
 * This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"

 * 
 * @author rdarshan
 *
 */
public class WithoutX2 {

	public static void main(String[] args) {

		String str = "Hxi";
		System.out.println(withoutX2(str));
		System.out.println(withoutX2Small(str));

		
	}

	private static String withoutX2Small(String str) {

		String temp = "";
		
		for(int i=0; i<str.length(); i++) {
			
			if(i == 0 && str.charAt(i) == 'x') { // if(i == 0 && str.charAt(i) != 'x') 
				
				temp+="";						// temp+=str.charAt(i);
				
			} else if(i == 1 && str.charAt(i) == 'x') { // else if(i == 1 && str.charAt(i) != 'x')
				
				temp+="";								// temp+=str.charAt(i);
					
			} else {								// else if(i >1)
				
				temp+=str.charAt(i); 				// temp+=str.charAt(i)
				
			}
			
		}
		
		return temp;
	}

	private static String withoutX2(String str) {
		
		if(str.length() <= 1) {
			
			return (str.equals("x")) ? "" : str;
		}
		
		String first2Char = str.substring(0, 2);
		
		String leftChars = str.substring(2);
		
		if(first2Char.charAt(0) == 'x') {
			
			first2Char = first2Char.substring(1);
			
		}
		
		if(first2Char.charAt(first2Char.length() - 1) == 'x') {
			
			first2Char = first2Char.substring(0, first2Char.length() - 1);
			
		}
		
		return first2Char + leftChars;
		
	}

}
