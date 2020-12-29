package com.string_1;
/**
 * Given two strings, append them together (known as "concatenation") and 
 * return the result. However, if the concatenation creates a double-char, 
 * then omit one of the chars, so "abc" and "cat" yields "abcat".


conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"

 * 
 * @author rdarshan
 *
 */
public class ConCat {

	public static void main(String[] args) {

		String a = "abc", b = "cat";
		System.out.println(conCat(a, b));
		
	}

	private static String conCat(String a, String b) {
		
		if(a.length() == 0 || b.length() == 0) return a + b;
		
		return (a.substring(a.length() - 1).equals(b.substring(0, 1)))? a + b.substring(1) : a + b;
		
	}

}
