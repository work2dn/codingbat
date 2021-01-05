package com.string_2;
/**
 * Return the number of times that the string "hi" appears anywhere in the given
 *  string.


countHi("abc hi ho") → 1
countHi("ABChi hi") → 2

 * 
 * @author rdarshan
 *
 */
public class CountHi {

	public static void main(String[] args) {

		String str = "ABChi hi";
		System.out.println(countHi(str));
		
	}

	private static int countHi(String str) {
		
		int count = 0;
		
		for(int i=0; i<str.length() - 1; i++) {
			
			count = (str.substring(i, i+2).equals("hi"))? ++count : count;
			
		}
		
		return count;
		
	}

}
