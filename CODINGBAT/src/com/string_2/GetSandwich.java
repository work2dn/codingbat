package com.string_2;
/**
 * 
 * A sandwich is two pieces of bread with something in between. 
 * Return the string that is between the first and last appearance of "bread" in 
 * the given string, or return the empty string "" if there are not 
 * two pieces of bread.
 * 
 * 


getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
 
 
 * 	
 * @author rdarshan
 *
 */




public class GetSandwich {

	public static void main(String[] args) {

		String str = "breadjambread";
		System.out.println(getSandwich(str));
		
	}

	private static String getSandwich(String str) {
		
		int countBread = 0;
		
		String result = "";
		
		//check whether number of times 'bread' appears is greater than or equal to 2
		for(int i=0; i<str.length() - 4; i++) {
			
			if(str.substring(i, i+5).equals("bread")) {
				
				countBread++;
				
			}
			
		}
		
		if(countBread >= 2) {
			
			
			
		}
		
		return result;
		
	}

}
