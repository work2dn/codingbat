package com.array2;

import java.util.Arrays;

/**
 * We'll say that an element in an array is "alone" if there are values before 
 * and after it, and those values are different from it. 
 * 
 * Return a version of the given array where every instance of the given 
 * value which is alone is replaced by whichever value to its 
 * left or right is larger.


notAlone([1, 2, 3], 2) → [1, 3, 3]
notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
notAlone([3, 4], 3) → [3, 4]

 * 
 * @author rdarshan
 *
 */


public class NotAlone {

	public static void main(String[] args) {

		int[] nums = {1, 2, 3, 2, 5, 2};	
		int val = 2;
		
		System.out.println(Arrays.toString(notAlone(nums, val)));

	}

	private static int[] notAlone(int[] nums, int val) {
		
		if(nums.length < 2) {
			
			return nums;
			
		}
		
		for(int i=1; i<nums.length-1; i++) {
			
			if(nums[i] == val && nums[i+1] != nums[i] && nums[i-1] != val) {
				
				nums[i] = (nums[i+1] > nums[i-1]) ? nums[i+1] : nums[i-1]; 
						
			}
			
		}
		
		return nums;
	}

}
