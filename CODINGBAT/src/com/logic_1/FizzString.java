package com.logic_1;

/**
 * 
 * Given a string str,
 * 
 * if the string starts with "f" return "Fizz".
 * 
 * If the string ends with "b" return "Buzz".
 * 
 * If both the "f" and "b" conditions are true, return "FizzBuzz". In all other
 * cases, return the string unchanged. (See also: FizzBuzz Code)
 * 
 * 
 * fizzString("fig") → "Fizz" fizzString("dib") → "Buzz" fizzString("fib") →
 * "FizzBuzz"
 * 
 * 
 * 
 * @author rdarshan
 *
 */
public class FizzString {

	public static void main(String[] args) {

		String str = "fig";
		System.out.println(fizzString(str));
		System.out.println(fizzStringCB(str));

	}

	private static String fizzString(String str) {

		boolean startWitf = (str.charAt(0) == 'f');
		boolean endWithb = (str.charAt(str.length() - 1) == 'b');

		if (startWitf && endWithb) {

			return "FizzBuzz";

		} else if (startWitf && !endWithb) {

			return "Fizz";

		} else if (!startWitf && endWithb) {

			return "Buzz";

		}

		return str;

	}

	public static String fizzStringCB(String str) {
		
		boolean f = str.startsWith("f");
		boolean b = str.endsWith("b");

		if (f && b)
			return "FizzBuzz";
		if (f)
			return "Fizz";
		if (b)
			return "Buzz";
		return str;

		// Style: you could use a series of "else" there, but it seems simpler
		// to just not have them.
	}

}
