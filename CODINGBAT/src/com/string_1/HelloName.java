package com.string_1;

/**
 * 
 Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
 * 
 * @author rdarshan
 *
 */
public class HelloName {

	public static void main(String[] args) {
		
		String name = "Bob";
		System.out.println(helloName(name));
		
	}

	private static String helloName(String name) {

		return "Hello " + name +"!";
		
	}

}
