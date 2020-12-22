package com.array3;

/**
 * Given a non-empty array, return true if there is a place to split the array so 
 * that the sum of the numbers on one side is equal to the sum of the numbers 
 * on the other side.


canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true

 * 
 * @author rdarshan
 *
 */
public class CanBalance {

	public static void main(String[] args) {

		int[] nums = {2, 1, 1, 2, 1};
		
		System.out.println(canBalance(nums));
	
	}

	private static boolean canBalance(int[] nums) {
		
		for(int i=0; i<nums.length; i++) {
			
			int sumFirst = sum(0, i, nums);
			
			int sumSecond = sum(i, nums.length, nums);
			
//			System.out.print("sumfirst: " + sumFirst);
//			System.out.println("\tsumsecond: " + sumSecond);
			
			if (sumFirst == sumSecond) return true; 
			
		}
		
		return false;
		
	}

	private static int sum(int start, int end, int[] nums) {
		
		int sum = 0;
		
		for(int j=start; j<end; j++) {
			
			sum+=nums[j];
			
		}
		
		return sum;
		
	}

}
