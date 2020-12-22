package com.array2;

/**
 * 
 * Given an array of ints, return true if it contains no 1's or it contains no 4's.


no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
 * 
 * 
 * @author rdarshan
 *
 */
public class No14 {

	public static void main(String[] args) {

		int[] nums = {2};
		
		System.out.println(no14(nums));
		
	}

	private static boolean no14(int[] nums) {
		
		
		if(nums.length < 2)  return true;

		boolean in1 = false, in4 = false;
		
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i] == 1) {
				
				in1 = true;
				
			}
			
			if(nums[i] == 4) {
				
				in4 = true;
				
			}
			
		}
		
		if(in1 == true && in4 == true) {
			
			return false;
			
		}
		
		if(in1 == true && in4 != true) {
			
			return true;
			
		}
		
		if(in1 != true && in4 == true) {
			
			return true;
			
		}
		
		return false;
	}

}
