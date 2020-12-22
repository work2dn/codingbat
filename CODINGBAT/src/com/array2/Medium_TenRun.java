package com.array2;

import java.util.Arrays;

/**
 * For each multiple of 10 in the given array, change all the values
 *  following it to be that multiple of 10, until encountering another 
 *  multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.


tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
 * 
 * @author rdarshan
 *
 */
public class Medium_TenRun {

	public static void main(String[] args) {

		int[] nums = {2, 10, 3, 4, 20, 5};
		System.out.println(Arrays.toString(tenRun(nums)));
		
	}

	private static int[] tenRun(int[] nums) {

		boolean multiple10 = false;
		int temp = 0;
		
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i] % 10 == 0) {
				
				temp = nums[i];
				
				multiple10 = true;
				
			} else if(nums[i] % 10 != 0 && multiple10) {
				
				nums[i] = temp;
				
			}
			
		}
		
		return nums;
	}

}
