package com.warmup_2;

/**
 * 
 * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, 
 * followed by the value plus 5, followed by the value minus 1. 
 * 
 * Additionally the 271 counts even if the "1" differs by 2 or less from the 
 * correct value.


has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true

 * 
 * @author rdarshan
 *
 */
public class Has271 {

	public static void main(String[] args) {

		int[] nums = {1, 2, 8, 1};
		System.out.println(has271(nums));
		
	}

	private static boolean has271(int[] nums) {

		for(int i=0; i<nums.length; i++) {
			
			int end1=i+1, end2=i+2;
			
			if((end1 >= nums.length) || (end2 >= nums.length))  break;
			
			if(nums[end1] == nums[i] + 5 && Math.abs(nums[i] - 1 - nums[end2]) <= 2) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}

}
