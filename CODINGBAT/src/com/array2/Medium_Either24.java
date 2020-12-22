package com.array2;

/**
 * 
 * Given an array of ints, return true if the array contains a 2 next to a 2 or
 * a 4 next to a 4, but not both.
 * 
 * 
 * either24([1, 2, 2]) → true 
 * either24([4, 4, 1]) → true
 * either24([4, 4, 1, 2, 2]) → false
 * 
 * 
 * @author rdarshan
 *
 */
public class Medium_Either24 {

	public static void main(String[] args) {

		int[] nums = { 4, 4, 1, 2, 2 };
		
		System.out.println(either24(nums));
		
	}

	private static boolean either24(int[] nums) {

		boolean in2 = false, in4 = false;

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == 2 && nums[i + 1] == 2) {

				in2 = true;

			}
			
			if (nums[i] == 4 && nums[i + 1] == 4) {

				in4 = true;

			}

		}

		/*
		if(in2 == true && in4 == true) {
			
			return false;
			
		}
		
		if(in2 != true && in4 == true) {
			
			return true;
			
		}
		
		if(in2 == true && in4 != true) {
			
			return true;
			
		}
		
		*/
		
		return in2 != in4;
	}

}
