package com.array2;

import java.util.Arrays;

/**
 * Return an array that contains the exact same numbers as the given array, but rearranged
 * so that all the even numbers come before all the odd numbers. Other than that, the numbers
 * can be in any order. You may modify and return the given array, or make a new array.


evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]

 * @author rdarshan
 *
 */
public class EvenOdd {

	public static void main(String[] args) {

		int[] nums = {3, 3, 2};
		
		System.out.println(Arrays.toString(evenOdd(nums)));
		System.out.println(Arrays.toString(evenOddBetter(nums)));
		
		System.out.println(Arrays.toString(evenOddAnother(nums)));
		
	}

	private static int[] evenOddBetter(int[] nums) {
		
		int countE = 0;
		int countO = nums.length - 1;
		
		int[] array = new int[nums.length];
		
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i] % 2 == 0) {
				
				array[countE] = nums[i];
				
				countE++;
				
			} else {
				
				array[countO] = nums[i];
				
				countO--;
				
			}
			
		}
		
		return array;
	}

	// [3, 3, 2]) → [2, 3, 3]
	private static int[] evenOdd(int[] nums) {
		
		int[] result = new int[nums.length];
		
		int resEvenIndex = 0;
		
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i]%2 == 0) {
				
				result[resEvenIndex] = nums[i];
				resEvenIndex++;
				
			}
			
		}
		
		for(int i=0; i<nums.length; i++) {
				
				if(nums[i]%2 != 0) {
					
					result[resEvenIndex] = nums[i];
					resEvenIndex++;
					
				}
		}
		
		return result;
		
	}
	
	// better space complexity method below
	public static int[] evenOddAnother(int[] nums) {
	    int i = 0;
	    
	    while(i < nums.length && nums[i] % 2 == 0)
	        i++;
	              
	    for(int j = i + 1; j < nums.length; j++) {
	        if(nums[j] % 2 == 0) {
	            int temp = nums[i];
	            nums[i] = nums[j];
	            nums[j] = temp;
	            i++;
	        }
	    }
	                                                    
	    return nums;
	}

}
