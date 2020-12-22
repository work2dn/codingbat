package com.array3;

import java.util.Arrays;

/**
 * (This is a slightly harder version of the fix34 problem.) Return an array
 * that contains exactly the same numbers as the given array, but rearranged so
 * that every 4 is immediately followed by a 5. Do not move the 4's, but every
 * other number may move. The array contains the same number of 4's and 5's, and
 * every 4 has a number after it that is not a 4. In this version, 5's may
 * appear anywhere in the original array.
 * 
 * 
 * fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9] fix45([1, 4, 1, 5]) → [1, 4,
 * 5, 1] fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
 * 
 * @author rdarshan
 *
 */
public class Medium_Fix45 {

	public static void main(String[] args) {

		int[] nums = { 5, 4, 9, 4, 9, 5 };

		System.out.println("Original: " + Arrays.toString(nums));

		System.out.println("Changed: " + Arrays.toString(fix45(nums)));

	}

	private static int[] fix45(int[] nums) {

		int j = 0;
		
		for (int i = 0; i < nums.length - 1; ++i) {
			
			if (nums[i] == 4 && nums[i + 1] != 5) {
				
				while (nums[j] != 5 || (j != 0 && nums[j - 1] == 4)) {
					
					j++;
					
				}
				
				nums[j] = nums[i + 1];
				
				nums[i + 1] = 5;
				
			}
			
		}

		return nums;
		
	}

	// below not clear.. need more revision
	private static int[] fix45Better(int[] nums) {

		int j = 0;
		
		for (int i = 0; i < nums.length - 1; ++i) {
			
			if (nums[i] == 4 && nums[i + 1] != 5) {
				
				/*
				 * Need to find the next movable 5 That means an element that is 5 and either is
				 * the first element or is preceded by anything other than 4
				 */
				
				while (nums[j] != 5 || (j != 0 && nums[j - 1] == 4)) {
					
					j++;
					
				}
				
				nums[j] = nums[i + 1];
				
				nums[i + 1] = 5;
				
			}
			
		}

		return nums;
		
	}

}
