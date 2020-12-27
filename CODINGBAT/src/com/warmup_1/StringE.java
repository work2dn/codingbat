package com.warmup_1;

/**
 * Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false

 * 
 * @author rdarshan
 *
 */
public class StringE {

	public static void main(String[] args) {

		String str = "Heelele";
		System.out.println(stringE(str));
		
	}

	private static boolean stringE(String str) {
		
		int countE = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			countE = (str.charAt(i) == 'e') ? ++countE : countE;
				
		}
		
		return (countE >= 1 && countE <= 3);
		
		/*
		 * codingbat solution below:
		  
		  int count = 0;

		  for (int i=0; i<str.length(); i++) {
		    if (str.charAt(i) == 'e') count++;
		    // alternately: str.substring(i, i+1).equals("e")
		  }
		
		  return (count >= 1 && count <= 3);
		 
		 */
		
	}

}
