package com.warmup_1;

/**
 * Given a string, return a string made of the first 2 chars (if present), however 
 * include first char only if it is 'o' and include the second only if it is 'z', 
 * so "ozymandias" yields "oz".


startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 
 
 * @author rdarshan
 *
 */
public class StartOz {

	public static void main(String[] args) {

		String str = "oxx";
		System.out.println(startOz(str));

	}

	private static String startOz(String str) {
		
		if(str.length() >= 2) {
			
			char firstChar = str.charAt(0);
			char secondChar = str.charAt(1);
			
			if(firstChar == 'o' && secondChar == 'z') {
				
				return "" + firstChar + secondChar;
				
			} else if(firstChar == 'o' && secondChar != 'z') {
				
				return firstChar + "";
				
			} else if(firstChar != 'o' && secondChar == 'z') {
				
				return secondChar + "";
				
			}
			
			return "";
			
		} else if(str.length() == 1) {
			
			return (str.equals("o"))? str:"";
			
		}
		
		return "";
		
		/*
		 * CODINGBAT GIVEN SOLUTION BELOW:
		 * 
		 * String result = "";
  
		  if (str.length() >= 1 && str.charAt(0)=='o') {
		    result = result + str.charAt(0);
		  }
		  
		  if (str.length() >= 2 && str.charAt(1)=='z') {
		    result = result + str.charAt(1);
		  }
		  
		  return result;
		  
		 */
		
	}

}
