package com.array1;

import java.util.Arrays;

/**
 * Given an array of ints of even length, return a new array length 2 containing the middle
 *  two elements from the original array. The original array will be length 2 or more.


makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
 * 
 * @author rdarshan
 *
 */
public class MakeMiddle {

	public static void main(String[] args) {

		int[] nums = {1, 2, 3, 4};
		
		System.out.println(Arrays.toString(makeMiddle(nums)));
		
	}

	private static int[] makeMiddle(int[] nums) {
		
		int middle = nums.length/2;

		return new int[] {nums[middle - 1], nums[middle]};
		
	}

}
