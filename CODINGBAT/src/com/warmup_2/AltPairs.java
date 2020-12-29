package com.warmup_2;

/**
 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... 
 * so "kittens" yields "kien".


altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
 * 
 * @author rdarshan
 *
 */
public class AltPairs {

	public static void main(String[] args) {

		String str = "Chocolate";
		System.out.println(altPairs(str));
		System.out.println(altPairsCB(str));
		
	}

	private static String altPairsCB(String str) {

		String result = "";
		
		for(int i=0; i<str.length(); i+=4) {
			
			int end = i + 2;
			
			if(end > str.length()) {
				
				end = str.length();
				
			}
			
			result+=str.substring(i, end);
			
		}
		  
		return result;
		 
	}

	private static String altPairs(String str) {
		
		String result = "";
		
		for(int i=0; i<str.length(); i+=4) {
			
			result = result + str.charAt(i);
			if(i+1 < str.length()) result = result + str.charAt(i+1);
			
		}
		
		return result;
		
	}

}
