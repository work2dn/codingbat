package com.warmup_2;

/**
 * 
 * Given a string and a non-negative int n, we'll say that the front of the string 
 * is the first 3 chars, or whatever is there if the string is less than length 3. 
 * Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"

 * @author rdarshan
 *
 */
public class FrontTimes {

	public static void main(String[] args) {

		String str = "te";
		
		int n = 2;
		
		System.out.println(frontTimes(str, n));
		
	}

	private static String frontTimes(String str, int n) {
		
		String front = "", result = "";
		
		if(str.length() < 3) {
			
			front = str;
		
		} else {
			
			front = str.substring(0, 3);
			
		}
		
		while(n > 0) {
			
			result = result + front;
			
			n--;
			
		}
		
		return result;
		
		/*
		 * codingbat solution below:
		 * 
		  	  int frontLen = 3;
			  if (frontLen > str.length()) {
			    frontLen = str.length();
			  }
			  String front = str.substring(0, frontLen);
			  
			  String result = "";
			  for (int i=0; i<n; i++) {
			    result = result + front;
			  }
			  return result;
		 */
		
	}

}
