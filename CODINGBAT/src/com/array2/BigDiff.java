package com.array2;

/**
 * 
 * Given an array length 1 or more of ints, return the difference between the largest and 
 * smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods
 *  return the smaller or larger of two values.


bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8

 * 
 * 
 * @author rdarshan
 *
 */
public class BigDiff {

	// below we can use "args" instead of "arg"
	public static void main(String[] args) {

		int[] nums = {10, 3, 5, 6};
		
		System.out.println(bigDiff(nums));
		
	}

	private static int bigDiff(int[] nums) {

		int min = 0, max = 0;
		
		if(nums.length < 2) return 0;
		
		
		min = max = nums[0];
		
		for(int i=0; i<nums.length; i++) {
			
			min = Math.min(nums[i], min);
			max = Math.max(nums[i], max);
			
		}
				
		return (max - min);
		
	}

}
