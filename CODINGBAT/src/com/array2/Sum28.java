package com.array2;

/**
 * 
 * Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.


sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
 * 
 * @author rdarshan
 *
 */
public class Sum28 {

	public static void main(String[] args) {

		int[] nums = {2, 3, 2, 2, 4, 2};
		
		System.out.println(sum28(nums));
		
	}

	private static boolean sum28(int[] nums) {

		int sum = 0;
		
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i] == 2) {
				
				sum+=nums[i];
				
			}
			
		}
		
		if(sum == 8) {
			
			return true;
			
		}
			
		return false;
		
	}

}
