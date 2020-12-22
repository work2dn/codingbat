package com.array2;

import java.util.Arrays;

/**
 * 
 * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. 
 * You may modify and return the given array, or return a new array.


shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
 * 
 * 
 * @author rdarshan
 *
 */
public class ShiftLeft {

	public static void main(String[] args) {
		
		int[] nums = {6, 2, 5, 3};
		System.out.println(Arrays.toString(shiftLeftBetter(nums)));
		
	}

	private static int[] shiftLeft(int[] nums) {
		
		if(nums.length > 0) {
			
			int temp = nums[0];
			
			for(int i=0; i<nums.length; i++) {
				
				if(i == nums.length - 1) {
					
					nums[i] = temp;
					
				} else {
					
					nums[i] = nums[i+1];
					
				}
				
			}
			
		}
		
		return nums;
		
	}
	
	private static int[] shiftLeftBetter(int[] nums) {
		
		if(nums.length > 0) {
			
			int temp = nums[0];
			
			for(int i=1; i<nums.length; i++) {
				
					nums[i-1] = nums[i];
					
			}
			
			nums[nums.length - 1] = temp;
				
		}
			
		return nums;
		
	}

}
