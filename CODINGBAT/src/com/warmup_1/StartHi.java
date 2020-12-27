package com.warmup_1;

/**
 * Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false

 * @author rdarshan
 *
 */
public class StartHi {

	public static void main(String[] args) {

		String str = "hi there";
		System.out.println(startHi(str));
		
	}

	private static boolean startHi(String str) {
		
//		return (str.startsWith("hi"))? true : false;
		
		if(str.length() < 2) return false;
		
		String first2Char = str.substring(0, 2);
		
		return (first2Char.equals("hi"))? true:false;
		
	}

}
