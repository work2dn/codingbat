package com.array1;

/**
 * 
 * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
 * Return true if the given array contains an unlucky 1 in the first 2 or last 2
 * positions in the array.
 * 
 * 
 * unlucky1([1, 3, 4, 5]) → true 
 * unlucky1([2, 1, 3, 4, 5]) → true 
 * unlucky1([1, 1, 1]) → false
 * 
 * 
 * @author rdarshan
 *
 */
public class Unlucky1 {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1 };
		System.out.println(unlucky1(nums));
	}

	private static boolean unlucky1(int[] nums) {

		if (nums.length < 2) {
			
			return false;
			
		}
			

		if (nums.length == 2) {

			if (nums[0] == 1 && nums[1] == 3) {

				return true;

			} else {

				return false;

			}

		}

		if(checkUnlucky1(nums, 0) || checkUnlucky1(nums, 1) || checkUnlucky1(nums, nums.length - 2)) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}

	private static boolean checkUnlucky1(int[] nums, int index) {
		
		if(nums[index] == 1 && nums[index+1] == 3) {
			
			return true;
			
		} else {
			
			return false;
		}
		
	}

}
