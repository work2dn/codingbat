package com.array2;

import java.util.Arrays;

/**
 * Given a non-empty array of ints, return a new array containing the
 * elements from the original array that come before the first 4 in
 * the original array. The original array will contain at least one 4. 
 * Note that it is valid in java to create an array of length 0.


pre4([1, 2, 4, 1]) → [1, 2]
pre4([3, 1, 4]) → [3, 1]
pre4([1, 4, 4]) → [1]
 * 
 * @author rdarshan
 *
 */
public class Pre4 {

	public static void main(String[] args) {

		int[] nums = {1, 2, 4, 1};
		System.out.println(Arrays.toString(pre4(nums)));
		System.out.println(Arrays.toString(pre4Better(nums)));
		
	}

	private static int[] pre4Better(int[] nums) {

		int i = 0;
		
		while(nums[i] != 4) {
			i++;
		}
		
		int[] arr = new int[i];
		
		for(int j=0; j<i; j++) {
			
			arr[j] = nums[j];
			
		}
		
		return arr;
	}

	private static int[] pre4(int[] nums) {
		
		int[] res  = new int[0];
		boolean contain4 = false;
		
		// find index of first 4
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i] == 4) {
				
				res = new int[i];
				contain4 = true;
				
				break;
				
			}
			
		}
		
		if(contain4) {
			
			for(int i=0; i<res.length; i++) {
				
				res[i] = nums[i];
				
			}
		}
		
		return res;
	}

}
