package com.array2;

import java.util.Arrays;

/**
 * 
 * Given a non-empty array of ints, return a new array containing 
 * the elements from the original array that come after the 
 * last 4 in the original array. 
 * 
 * The original array will contain at least one 4. 
 * Note that it is valid in java to create an array of length 0.


post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
 * 
 * @author rdarshan
 *
 */
public class Post4 {

	public static void main(String[] args) {

		int[] nums = {4, 4, 1, 2, 3};
		System.out.println(Arrays.toString(post4(nums)));
		System.out.println(Arrays.toString(post4Better(nums)));

		
	}

	private static int[] post4(int[] nums) {
		
		int i = nums.length - 1;
		
		while(i >= 0) {
			
			if(nums[i] == 4) {
				
				break;
			}
			
			i--;
			
		}
		
		int[] result = new int[nums.length - 1 - i];
		
		for(int j=0; j<result.length; j++) {
			
			result[j] = nums[i+1];
			
			i++;// this part is not being done in better code.. so they are 
			// substituting it by adding 'j' in nums[i+j+1]
			
		}
		
		return result;
		
	}
	
	public static int[] post4Better(int[] nums) {
		
	    int i = nums.length - 1;
	    
	    while(nums[i] != 4)
	        i--;
	              
	    int[] arr = new int[nums.length - i - 1];
	                  
	    for(int j = 0; j < arr.length; j++)
	        arr[j] = nums[i + j + 1];
	                          
	    return arr;
	    
	}

}
