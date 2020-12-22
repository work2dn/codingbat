package com.array2;

import java.util.Arrays;

/**
 * 
 * Return a version of the given array where all the 10's have been removed. The
 * remaining elements should shift left towards the start of the array as
 * needed, and the empty spaces at the end of the array should be 0.
 * 
 * So {1, 10, 10, 2} yields {1, 2, 0, 0}.
 * 
 * You may modify and return the given array or make a new array.
 * 
 * 
 * withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0] withoutTen([10, 2, 10]) → [2, 0, 0]
 * withoutTen([1, 99, 10]) → [1, 99, 0]
 * 
 * 
 * @author rdarshan
 *
 */
public class Medium_WithoutTen {

	public static void main(String[] args) {

		int[] nums = { 1, 10, 10, 2, 3 };

		System.out.println(Arrays.toString(withoutTenReverseOrder(nums)));
		
		int[] nums1 = { 1, 10, 10, 2, 3 };
		System.out.println(Arrays.toString(withoutTen(nums1)));

		int[] nums2 = { 1, 10, 10, 2, 3};
		System.out.println(Arrays.toString(withoutTenNetCopy(nums2)));

	}

	
//	{ 1, 10, 10, 2, 3} --> {1, 2, 3, 0, 0}
	private static int[] withoutTenNetCopy(int[] nums) {
		
		int[] result = new int[nums.length];
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == 10) {
				
			} else {
				
				result[j] = nums[i];
				
				j++;
				
			}
		}
		
		for (int i = j; i < nums.length; i++) {
			
			result[i] = 0;
			
		}
		
		return result;

	}

	// {1, 10, 10, 2, 3} --> {1, 2, 3, 0, 0}
	private static int[] withoutTen(int[] nums) {

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 10) {

				for (int j = i + 1; j < nums.length; j++) {

					if (nums[j] != 10) {

						nums[i] = nums[j];
						nums[j] = 10;
						break;

					}

				}

			}

		}

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 10) {

				nums[i] = 0;

			}
		}

		return nums;

	}

	// below code will reverse the elements order
	// like {1, 10, 10, 2, 3} --> {1, 3, 2, 0, 0} but we want {1, 2, 3, 0, 0}
	private static int[] withoutTenReverseOrder(int[] nums) {

		int last = nums.length - 1;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 10) {

				while (nums[last] == 10 && nums.length > 1) {

					last--;

				}

				if (i > last) {

					break;

				}

				nums[i] = nums[last];
				nums[last] = 10;

			}

		}

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 10) {

				nums[i] = 0;

			}
		}

		return nums;
	}

}
