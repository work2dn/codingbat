package com.array1;

import java.util.Arrays;

/**
 * 
 * Given 2 int arrays, a and b, of any length, return a new array with the first
 * element of each array. If either array is length 0, ignore that array.
 * 
 * 
 * front11([1, 2, 3], [7, 9, 8]) → [1, 7] 
 * front11([1], [2]) → [1, 2] 
 * front11([1, 7], []) → [1]
 * 
 * @author rdarshan
 *
 */
public class Front11 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		int[] b = { 7, 9, 8 };

		System.out.println(Arrays.toString(front11(a, b)));
	}

	private static int[] front11(int[] a, int[] b) {

		if (a.length == 0 && b.length == 0) {

			return new int[] {};

		}

		if (a.length != 0 && b.length == 0) {
			
			return new int[] {a[0]};

		} else if(a.length == 0 && b.length != 0) {
			
			return new int[] {b[0]};

		} else {
			
			return new int[] {a[0], b[0]};
		}
		
		

	}

}
