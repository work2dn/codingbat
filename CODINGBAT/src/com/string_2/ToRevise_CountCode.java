package com.string_2;
/**
 * 
 * Return the number of times that the string "code" appears anywhere in the 
 * given string, except we'll accept any letter for the 'd', so "cope" 
 * and "cooe" count.


countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2

 * 
 * @author rdarshan
 *
 */
public class ToRevise_CountCode {

	public static void main(String[] args) {

		String str = "cozexxcope";
		System.out.println(countCode(str));
		
	}

	private static int countCode(String str) {
		
		int countCode = 0;
//		int cde = (int)'c' + (int)'o' + (int)'e'; // chances of collision in case of CAPITAL LETTERS
		
		for(int i=0; i<str.length() - 3; i++) {
			
//			int threeCharExceptD = (int)str.charAt(i) + (int)str.charAt(i+1) + (int)str.charAt(i+3);
			
//			if(cde == threeCharExceptD) countCode++; // chances of collision in case of CAPITAL LETTERS
			
			if(str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e') countCode++;
		}
		
		return countCode;
		
	}

}
