package com.array1;
//testin push 2

import java.util.Arrays;
/**
 * 
 * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
 *  Return the array which has the largest sum. In event of a tie, return a.


biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]
 * 
 * @author rdarshan
 *
 */
public class BiggerTwo {

	public static void main(String[] args) {
		int[] a = {1, 2};
		int[] b = {3, 4};
		
		System.out.println(Arrays.toString(biggerTwo(a, b)));
	}

	private static int[] biggerTwo(int[] a, int[] b) {
		
		int sumA = sum(a);
		int sumB = sum(b);

		return (sumB > sumA) ? b : a;
		
	}

	private static int sum(int[] a) {
		
		int sumT = 0;
		
		if(a.length == 0) {
			
			return 0;
			
		} else {
			
			for(int i=0; i<a.length; i++) {
				
				sumT+=a[i];
				
			}
		}
		
		return sumT;
		
	}

}
