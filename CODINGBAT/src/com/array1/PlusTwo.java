package com.array1;

import java.util.Arrays;

/**
 * 
 * Given 2 int arrays, each length 2, return a new array length 4 containing all
 * their elements.
 * 
 * 
 * plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4] plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
 * plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 * 
 * @author rdarshan
 *
 */
public class PlusTwo {

	public static void main(String[] args) {

		int[] a = { 1, 2 };
		int[] b = { 3, 4 };

		System.out.println(Arrays.toString(plusTwo(a, b)));

	}

	private static int[] plusTwo(int[] a, int[] b) {
		
		int lenAB = a.length + b.length;
		int[] plusAB = new int[lenAB];
		
		for(int i=0; i<plusAB.length; i++) {
			
			if(i < a.length) {
				
				plusAB[i] = a[i];
				
			} else {
				
				plusAB[i] = b[i - a.length];
				
			}
			
			
			
			
		}
		
		return plusAB;
	}

}
