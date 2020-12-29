package com.string_1;
/**

Given a string, return true if it ends in "ly".


endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
 * 
 * @author rdarshan
 *
 */
public class EndsLy {

	public static void main(String[] args) {

		String str = "oddly";
		System.out.println(endsLy(str));
		
	}

	private static boolean endsLy(String str) {
		
		if(str.length() < 2) return false;
		
		return (str.substring(str.length() - 2).equals("ly"))? true : false;
		
	}

}
