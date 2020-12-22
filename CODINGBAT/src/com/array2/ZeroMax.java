package com.array2;

import java.util.Arrays;

/**
 * 
 * Return a version of the given array where each zero value in the array 
 * is replaced by the largest odd value to the right of the zero in the array. 
 * If there is no odd value to the right of the zero, leave the zero as a zero.


zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]

 * 
 * @author rdarshan
 *
 */
public class ZeroMax {

	public static void main(String[] args) {

		int[] nums = {0, 5, 0, 3};
		System.out.println(Arrays.toString(zeroMax(nums)));
		
	}

	private static int[] zeroMax(int[] nums) {
		
		for(int i=0; i<nums.length; i++) {
			
			int max = 0;
			
			if(nums[i] == 0) {
				
				for(int j=i+1; j<nums.length; j++) {

					if(nums[j]%2 != 0 && (nums[j] > max)) {
						
							max = nums[j];
							
					}
					
				}
				
				nums[i] = max;
 				
			}
			
		}
		
		return nums;
		
	}

}
