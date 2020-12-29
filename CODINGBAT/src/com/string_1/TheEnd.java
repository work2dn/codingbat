package com.string_1;

/**
 * Given a string, return a string length 1 from its front, unless front is false, 
 * in which case return a string length 1 from its back. The string will be non-empty.


theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
 * 
 * @author rdarshan
 *
 */
public class TheEnd {

	public static void main(String[] args) {

		String str = "Hello";
		boolean front = false;
		
		System.out.println(theEnd(str, front));
		
	}

	private static String theEnd(String str, boolean front) {

		return (front)? str.substring(0, 1) : str.substring(str.length() - 1);
		
	}

}
