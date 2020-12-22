package com.array2;

/**
 * 
 * Return true if the array contains, somewhere, three increasing 
 * adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.


tripleUp([1, 4, 5, 6, 2]) → true
tripleUp([1, 2, 3]) → true
tripleUp([1, 2, 4]) → false

 * @author rdarshan
 *
 */
public class TripleUp {
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 4};
		System.out.println(tripleUp(nums));
		
	}

	private static boolean tripleUp(int[] nums) {
		
		for(int i=2; i<nums.length; i++) {
			
			if(nums[i] - nums[i-1] == 1 && nums[i-1] - nums[i-2] == 1) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}
}
