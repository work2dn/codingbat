package com.array3;

import java.util.Arrays;

/**
 * Return an array that contains exactly the same numbers as the given array,
 * but rearranged so that every 3 is immediately followed by a 4.
 * 
 * Do not move the 3's, but every other number may move.
 * 
 * The array contains the same number of 3's and 4's, every 3 has a number after
 * it that is not a 3, and a 3 appears in the array before any 4.
 * 
 * 
 * fix34([1, 3, 1, 4]) → [1, 3, 4, 1] 
 * fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4,1, 1, 3, 4] 
 * fix34([3, 2, 2, 4]) → [3, 4, 2, 2] 
 * fix34([5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5]) → [5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4]
 * 
 * 
 * @author rdarshan
 *
 */

public class Medium_Fix34 {

	public static void main(String[] args) {

		int[] nums = { 5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5 };

		System.out.println("Original: " + Arrays.toString(nums));

		System.out.println("Changed: " + Arrays.toString(fix34(nums)));

		int[] nums1 = { 5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5 };
		System.out.println("Better: " + Arrays.toString(fix34Better(nums1)));

	}
	
	public static int[] fix34Better(int[] nums) {
		
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i] == 3) {
				
				for(int j=0; j<nums.length; j++) {
					
					if(nums[j] == 4 && nums[j-1] != 3) {
						
						int temp = nums[i+1];
						
						nums[i+1] = nums[j];
						
						nums[j] = temp;
						
					}
					
				}
				
			}
			
		}
		
 		return nums;
		
	}

	/*
	 * below code fails for value below:
	 * 
	 * fix34([5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5]) → [5, 3, 4, 5, 5, 5, 5, 5, 3, 4,
	 * 3, 4]
	 * 
	 * we are getting below value: [5, 3, 4, 5, 5, 5, 5, "4", 3, 4, 3, "5"]
	 * 
	 * instead of the value below: [5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4]
	 * 
	 */
	private static int[] fix34(int[] nums) {

		helperFix34(0, nums);

		return nums;

	}

	private static int[] helperFix34(int startIndex, int[] nums) {

//		System.out.println("start index: " + startIndex);
		if (startIndex > nums.length - 1) {

			return nums;

		}

		for (int i = startIndex; i < nums.length; i++) {

			if (nums[i] == 3) {

				if (nums[i + 1] == 4) {

					startIndex = i + 2;
					helperFix34(startIndex, nums);
					break;

				} else {

					for (int j = startIndex; j < nums.length; j++) {

						if (nums[j] == 4) {

							int temp = nums[i + 1];
							nums[i + 1] = nums[j];
							nums[j] = temp;

							startIndex = i + 2;
							helperFix34(startIndex, nums);
							break;
						}

					}

				}
			}

		}

//		System.out.println(Arrays.toString(nums) + " startIndex: " + startIndex);

		return nums;
	}

}
