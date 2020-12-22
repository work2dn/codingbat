package com.array1;

import java.util.Arrays;

/**
 * 
 * Given an array of ints, swap the first and last elements in the array. 
 * Return the modified array. The array length will be at least 1.


swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]

 * 
 * @author rdarshan
 *
 */
public class SwapEnds {

	public static void main(String[] args) {

		int nums[] = {1, 2, 3, 4};
		
		System.out.println(Arrays.toString(swapEnds(nums)));
		
	}

	private static int[] swapEnds(int[] nums) {
		
		int temp = nums[0];
		
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = temp;
		
		return nums;
	}

}
