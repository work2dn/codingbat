package com.warmup_2;

/**
 * 
 * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears 
 * in the array somewhere.


array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false

 * @author rdarshan
 *
 */
public class Array123 {

	public static void main(String[] args) {

		int[] nums = {1, 1, 2, 4, 1};
		System.out.println(array123(nums));
		
	}

	private static boolean array123(int[] nums) {
		
		for(int i=0; i<nums.length - 2; i++ ) {
			
			if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) return true;
		
		}
		
		return false;
		
	}

}
