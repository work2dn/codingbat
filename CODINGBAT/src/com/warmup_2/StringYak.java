package com.warmup_2;

/**
 
 Suppose the string "yak" is unlucky. Given a string, return a version where 
 all the "yak" are removed, but the "a" can be any char. 
 The "yak" strings will not overlap.


stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"

 * 
 * @author rdarshan
 *
 */
public class StringYak {

	public static void main(String[] args) {

		String str = "yak123ya";
		System.out.println(stringYak(str));
		
	}

	private static String stringYak(String str) {
		
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			
			int end = i+2;
			
//			if(i+2 >= str.length()) {
//				
//				break;
//				
//			}
			
			if(end < str.length() && str.charAt(i) == 'y' && str.charAt(end) == 'k') {
				
				i = end;
				
			} else {
				
				result+=str.substring(i, i+1);
				
			}
			
			
		}
		
		return result;
		
		/*
		 * Below is codingbat solution:
		 * 
		 * String result = "";
		  
		  for (int i=0; i<str.length(); i++) {
		    // Look for i starting a "yak" -- advance i in that case
		    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
		      i =  i + 2;
		    } else { // Otherwise do the normal append
		      result = result + str.charAt(i);
		    }
		  }
		  
		  return result;
		  
		 */
	}

}
