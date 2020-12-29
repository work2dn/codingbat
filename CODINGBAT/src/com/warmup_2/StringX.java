package com.warmup_2;
/**
 * 
 * Given a string, return a version where all the "x" have been removed. Except
 * an "x" at the very start or end should not be removed.
 * 
 * stringX("xxHxix") → "xHix" 
 * stringX("abxxxcd") → "abcd" 
 * stringX("xabxxxcdx") → "xabcdx"
 * 
 * 
 * 
 * 
 * @param args
 */
public class StringX {

	public static void main(String[] args) {

		String str = "abxxxcd";
		System.out.println(stringX(str));

	}

	private static String stringX(String str) {

		StringBuffer result = new StringBuffer();

		char[] strArray = str.toCharArray();

		for (int i = 0; i < strArray.length; i++) {
			
			if(i == 0 || i == strArray.length - 1) {
				
				result.append(strArray[i]);
				
			} else if (strArray[i] == 'x') {
				
				continue;
				
			} else {
				
				result.append(strArray[i]);
				
			}
			
			

		}

		return result.toString();
		
		/*
		 * 
		 * codingbat solution below:
		 * 
		 	  String result = "";
			  for (int i=0; i<str.length(); i++) {
			    // Only append the char if it is not the "x" case
			    if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
			      result = result + str.substring(i, i+1); // Could use str.charAt(i) here
			    }
			  }
			  return result;
		 */

	}

}
