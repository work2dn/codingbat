package com.array1;

import java.util.Arrays;

/**
 * 
 * Given an int array of any length, return a new array of its first 2 elements. 
 * If the array is smaller than length 2, use whatever elements are present.


frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
 * 
 * 
 * @author rdarshan
 *
 */
public class FrontPiece {

	public static void main(String[] args) {

		int[] nums = {1, 2, 3};
		
		System.out.println(Arrays.toString(frontPiece(nums)));
	}

	private static int[] frontPiece(int[] nums) {
		
		if(nums.length < 2)  return nums;
		
		return new int[] {nums[0], nums[1]};
 		
	}

}
