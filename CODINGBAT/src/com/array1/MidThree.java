package com.array1;

import java.util.Arrays;

/**
 * 
 * Given an array of ints of odd length, return a new array length 3 containing the 
 * elements from the middle of the array. The array length will be at least 3.


midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
 * 
 * @author rdarshan
 *
 */
public class MidThree {

	public static void main(String[] args) {

		int nums[] = {1, 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(midThree(nums)));
	}

	private static int[] midThree(int[] nums) {
		
		int middle = nums.length/2;
		
		int b4_middle = nums[middle - 1];
		int aft_middle = nums[middle + 1];
		
		return new int[] {b4_middle, nums[middle], aft_middle};
		
	}

}
