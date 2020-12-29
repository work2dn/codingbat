package com.warmup_2;

/**
 * 
 * Given a string, return the count of the number of times that a substring length 2 
 * appears in the string and also as the last 2 chars of the string, so "hixxxhi" 
 * yields 1 (we won't count the end substring).


last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2

 * 
 * @author rdarshan
 *
 */
public class Medium_Last2 {

	public static void main(String[] args) {

		String str = "1717171";
		System.out.println(last2(str));
		
	}

	private static int last2(String str) {
		
		int count = 0;
		
		if(str.length() < 2) return count;
		
		String last2Char = str.substring(str.length() - 2);
		
		for(int i=0; i<str.length() - 2; i++) {
			
			if(str.substring(i, i+2).equals(last2Char)) {
				
				count++;
				
			}
			
		}
		
		return count;
		
		/*
		 * 
		 codingbat solution below:
		 
		 // Screen out too-short string case.
		  if (str.length() < 2) return 0;
		  
		  String end = str.substring(str.length()-2);
		  // Note: substring() with 1 value goes through the end of the string
		  int count = 0;
		  
		  // Check each substring length 2 starting at i
		  for (int i=0; i<str.length()-2; i++) {
		    String sub = str.substring(i, i+2);
		    if (sub.equals(end)) {  // Use .equals() with strings
		      count++;
		    }
		  }

  return count;
		 * 
		 * 
		 */
		
	}

}
