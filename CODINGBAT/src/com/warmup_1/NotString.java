package com.warmup_1;

/**
 * Given a string, return a new string where "not " has been added to the front. 
 * However, if the string already begins with "not", return the string unchanged. 
 * Note: use .equals() to compare 2 strings.


notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"

 * @author rdarshan
 *
 */
public class NotString {

	public static void main(String[] args) {

		String str = "not bad";
		System.out.println(notString(str));
		
	}

	private static String notString(String str) {

		return (str.startsWith("not") ? str : "not " + str);
		
	}

}
