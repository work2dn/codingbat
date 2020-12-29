package com.warmup_2;

/**
 * 
 * Given 2 strings, a and b, return the number of the positions where they 
 * contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, 
 * since the "xx", "aa", and "az" substrings appear in the same place in 
 * both strings.


stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0

 
 * @author rdarshan
 *
 */
public class Medium_StringMatch {

	public static void main(String[] args) {

		String a = "abc";
		String b = "axc";
		
		System.out.println(stringMatch(a, b));
		
	}

	private static int stringMatch(String a, String b) {
		
		int count = 0;
		
		String largeStr = (a.length() > b.length())? a:b;
		
		String smallStr = (largeStr.equals(a))? b:a;
		
		for(int i=0; i<smallStr.length() - 1; i++) {
			
			if(smallStr.substring(i, i+2).equals(largeStr.substring(i, i+2))) count++;
			
		}
		
		return count;
		
		/**
		 * 
		 // Figure which string is shorter.
		  int len = Math.min(a.length(), b.length());
		  int count = 0;
		  
		  // Look at both substrings starting at i
		  for (int i=0; i<len-1; i++) {
		    String aSub = a.substring(i, i+2);
		    String bSub = b.substring(i, i+2);
		    if (aSub.equals(bSub)) {  // Use .equals() with strings
		      count++;
		    }
		  }
		
		  return count;
		  
		 */
		
	}

}
