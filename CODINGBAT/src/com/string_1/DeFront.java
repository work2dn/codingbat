package com.string_1;
/**
 Given a string, return a version without the first 2 chars. 
 Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
 The string may be any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
 * 
 * @author rdarshan
 *
 */
public class DeFront {

	public static void main(String[] args) {

		String str = "away";
		System.out.println(deFront(str));
		
	}

	private static String deFront(String str) {
		
		String result = "";
		
		int len = str.length();
		
		if(len < 1) return result;
		
		if(len == 1) return (str.equals("a"))? str : result;
		
		if(len > 1) {
			
			result = (str.substring(0, 1).equals("a"))? "a" : result;
			result = (str.substring(1, 2).equals("b"))? result + "b" : result;
			
			result+=str.substring(2);
			
		}
		
		return result;
		
	}

}
