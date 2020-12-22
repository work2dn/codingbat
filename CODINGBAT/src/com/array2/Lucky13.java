package com.array2;

/**
 * 
 * Given an array of ints, return true if the array contains no 1's and no 3's.


lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
 * 
 * @author rdarshan
 *
 */
public class Lucky13 {

	public static void main(String[] args) {

		int[] nums = {1, 2, 4};
		System.out.println(lucky13(nums));
		
	}

	private static boolean lucky13(int[] nums) {
		
		if(nums.length == 0) {
			
			return true;
			
		} else {
			
			for(int i=0; i<nums.length; i++) {
				
				if(nums[i] == 1 || nums[i] == 3) {
					
					return false;
					
				}
				
			}
			
		}

		return true;
	}

}
