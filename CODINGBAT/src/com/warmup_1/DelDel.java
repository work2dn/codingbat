package com.warmup_1;

/**
 * Given a string, if the string "del" appears starting at index 1, return a string 
 * where that "del" has been deleted. Otherwise, return the string unchanged.


delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
 * 
 * @author rdarshan
 *
 */
public class DelDel {

	public static void main(String[] args) {

		String str = "adedbc";
		System.out.println(delDel(str));
		
	}

	private static String delDel(String str) {

		int index = str.indexOf("del");
		
		if(index == 1) {
			
			return str.substring(0, 1) + str.substring(4);
			
		}
		
		return str;
	
		/*
		 * Codingbat given solution
		 * 
		 * if (str.length()>=4 && str.substring(1, 4).equals("del")) {
    		// First char + rest of string starting at 4
    	   return str.substring(0, 1) + str.substring(4);
  		   }
  		   // Otherwise return the original string.
  		   return str;
		 * 
		 */
	}

}
