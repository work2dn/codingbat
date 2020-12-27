package com.warmup_1;

/**
 * 
 * Given a non-empty string and an int N, return the string made starting with char 0,
 * and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... 
 * and so on. N is 1 or more.


	everyNth("Miracle", 2) → "Mrce"
	everyNth("abcdefg", 2) → "aceg"
	everyNth("abcdefg", 3) → "adg"
 * 
 * @author rdarshan
 *
 */
public class EveryNth {

	public static void main(String[] args) {

		String str = "abcdefg";
		int n  = 3;
		System.out.println(everyNth(str, n));
		
	}

	private static String everyNth(String str, int n) {
		
		String result = "";
		
		for(int i=0; i*n<str.length(); i++) {
			
			result = result + str.charAt(i*n);
			
		}
		
		return result;
		
		/*
		 * codingbat solution below;
		 * 
		 
		  String result = "";
  
		  // Look at every nth char
		  for (int i=0; i<str.length(); i = i + n) {
		    result = result + str.charAt(i);
		  }
		  return result;
		 
		 */
	}

}
