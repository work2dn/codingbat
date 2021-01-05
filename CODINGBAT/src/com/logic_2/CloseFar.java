package com.logic_2;
/**
 * 
 * Given three ints, a b c, return true if one of b or c 
 * is "close" (differing from a by at most 1), while the other is "far", 
 * differing from both other values by 2 or more. 
 * 
 * Note: Math.abs(num) computes the absolute value of a number.


closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true
 
 * 
 * @author rdarshan
 *
 */
public class CloseFar {

	public static void main(String[] args) {
		
		int a = 1, b = 2, c = 10;
		
		System.out.println(closeFar(a, b, c));
		
	}

	private static boolean closeFar(int a, int b, int c) {
		
		int ab = Math.abs(a - b);
		
		int ac = Math.abs(a - c);
		
		int bc = Math.abs(b - c);
		
		
		if(ab <= 1) {
			
			return (bc >= 2 && ac >= 2);
			
		}
		
		if(ac <= 1) {
			
			return (bc >= 2 && ab >= 2);
			
		}
		
		return false;
		
	}

}
