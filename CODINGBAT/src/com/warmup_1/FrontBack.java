package com.warmup_1;

/**
 * Given a string, return a new string where the first and last chars have been
 * exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"

 * @author rdarshan
 *
 */
public class FrontBack {

	public static void main(String[] args) {

		String str = "ab";
		
		System.out.println(frontBack(str));
		
	}

	private static String frontBack(String str) {
		
		if(str.length() <= 1) return str;
		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length() - 1);
		
		char[] result = str.toCharArray();
		result[0] = lastChar;
		result[str.length() - 1] = firstChar;
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<result.length; i++) sb.append(result[i]);
		
		return sb.toString();
		
		/*
		 * BELOW IS GOOD METHOD:
		 * 
		 * if (str.length() <= 1) return str;
  
  		String mid = str.substring(1, str.length()-1);
  
  		// last + mid + first
  		return str.charAt(str.length()-1) + mid + str.charAt(0);	
		 
		 */
		
	}

}
