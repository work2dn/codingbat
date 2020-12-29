package com.warmup_2;

/**
 * 
 * Given a string, return true if the first instance of "x" in the string is 
 * immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true

 * 
 * 
 * @author rdarshan
 *
 */
public class DoubleX {

	public static void main(String[] args) {

		String str = "xxxxx";
		System.out.println(doubleX(str));
		
	}

	private static boolean doubleX(String str) {
		
		int count = 0;
		
		for(int i=0; i<str.length() - 1; i++) {
			
			if(str.charAt(i) == 'x') {
				
				count++;
				
				return (count == 1 && str.charAt(i+1) == 'x') ? true : false;
				
			}
			
		}
		
		return false;
		
		/*
		 * codingbat solution below:
		 
		  int i = str.indexOf("x");
		  if (i == -1) return false; // no "x" at all
		
		  // Is char at i+1 also an "x"?
		  if (i+1 >= str.length()) return false; // check i+1 in bounds?
		  return str.substring(i+1, i+2).equals("x");
		  
		  // Another approach -- .startsWith() simplifies the logic
		  // String x = str.substring(i);
		  // return x.startsWith("xx");
		   * 
		 */
		
	}

}
