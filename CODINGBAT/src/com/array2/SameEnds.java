package com.array2;

/**
 * Return true if the group of N numbers at the start and end of the array are the same. 
 * For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and
 *  false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.


sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false


 * @author rdarshan
 *
 */
public class SameEnds {

	public static void main(String[] args) {

		int[] nums = {5, 6, 45, 99, 13, 5, 6};
		int len = 1;
		
		System.out.println(sameEnds(nums, len));
		
	}

	private static boolean sameEnds(int[] nums, int len) {
		
		if(len == 0) {
			
			return true;
			
		}
		
		for(int i=0; i<len; i++) {
			
//			System.err.print("nums[i] : " + nums[i]);
			
//			System.err.println("\t nums[nums.length - 1 - (len - i)] : " + nums[nums.length - (len - i)]);
			
			if(nums[i] != nums[nums.length - (len - i)]) {
				
				return false;
				
			}
		}
		
		return true;
		
	}

}
