package com.array2;

/**
 * Given an array of ints, return true if every element is a 1 or a 4.


only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
 * 
 * @author rdarshan
 *
 */
public class Only14 {

	public static void main(String[] args) {

		int[] nums = {1, 4, 1, 4};
		
		System.out.println(only14(nums));
		
	}

	private static boolean only14(int[] nums) {
		
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i] == 1 || nums[i] == 4) {
				
				continue;
			}
			
			return false;
			
		}
		
		return true;
	}

}
