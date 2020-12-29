package com.warmup_2;

/**
 * 
 * Given an array of ints, return true if one of the first 4 elements in the array 
 * is a 9. The array length may be less than 4.


arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false

 * @author rdarshan
 *
 */
public class ArrayFront9 {

	public static void main(String[] args) {

		int[] nums = {1, 2, 3, 4, 5};
		
		System.out.println(arrayFront9(nums));
		System.out.println(arrayFront9Better(nums));
		
	}

	private static boolean arrayFront9Better(int[] nums) {
		
		int end = nums.length;
		
		if(end > 4) end = 4;
		
		for(int i=0; i<end; i++) {
			
			if(nums[i] == 9) return true;			
		}
		
		return false;
		
	}

	private static boolean arrayFront9(int[] nums) {
		
		boolean result  = false;
		
		if(nums.length < 4) {
	
			result = helpArr(nums, nums.length);
			
		} else {
			
			result = helpArr(nums, 4);
			
		}
		
		return result;
		
	}

	private static boolean helpArr(int[] nums, int length) {
		
		for(int i=0; i<length; i++) {
			
			if(nums[i] == 9) return true;
			
		}
		
		return false;
	}

}
