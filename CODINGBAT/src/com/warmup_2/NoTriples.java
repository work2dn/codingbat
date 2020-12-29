package com.warmup_2;

/**

Given an array of ints, we'll say that a triple is a value appearing 3 times in 
a row in the array. Return true if the array does not contain any triples.


noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false

 * 
 * @author rdarshan
 *
 */
public class NoTriples {

	public static void main(String[] args) {

		int[] nums = {1, 1, 1, 2, 2, 2, 1};
		System.out.println(noTriples(nums));
		
	}

	private static boolean noTriples(int[] nums) {

		for(int i=0; i<nums.length; i++) {
			
			int end1 = i+1, end2 = i+2;
			
			if(end1 >= nums.length || end2 >= nums.length) break;
			
			if(nums[i] == nums[end1] && nums[i] == nums[end2]) return false;
			
		}
		
		return true;
		
	}

}
