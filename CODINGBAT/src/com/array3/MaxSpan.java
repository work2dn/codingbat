package com.array3;

/**
 * Consider the leftmost and rightmost appearances of some value in an array. 
 * We'll say that the "span" is the number of elements between the two inclusive. 
 * A single value has a span of 1. Returns the largest span found in the given array. 
 * (Efficiency is not a priority.)


maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6


 * 
 * 
 * @author rdarshan
 *
 */
public class MaxSpan {

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 1, 1, 3};
		
		System.out.println(maxSpan(nums));// 4
		
	}

	private static int maxSpan(int[] nums) {

		int last=0, maxLen=0;
		
		for(int i=0; i<nums.length; i++) {
			
			// finding last occurrence of the first/nums[i]
			for(int j=0; j<nums.length; j++) {
				
				if(nums[i] == nums[j]) {
					
					last = j;
					
				}
			}
			
			//1 is added as both are inclusive
			int length = last - i + 1;
			
			maxLen = (length > maxLen) ? length : maxLen;
			
		}
		
		return maxLen;
	}

}
