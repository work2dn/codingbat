package com.array2;

/**
 * 
 * Given an array of ints, return true if the value 3 appears in the array exactly 3 times, 
 * and no 3's are next to each other.


haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
 * 
 * @author rdarshan
 *
 */
public class Medium_HaveThree {

	public static void main(String[] args) {

		int[] nums = {3, 4, 3, 3, 4};
		System.out.println(haveThree(nums));
		System.out.println("Better solution: " + betterHaveThree(nums));
		
	}

	private static boolean betterHaveThree(int[] nums) {
		
		int count = 0;
		
		if(nums.length >= 1 && nums[0] == 3) {
			
			count++;
			
		}
		
		for(int i=1; i<nums.length; i++) {
			
			if(nums[i-1] == 3 && nums[i] == 3) {
				
				return false;
				
			}
			
			if(nums[i] == 3) {
				
				count++;
				
			}
			
		}
		
		return count == 3;
		
	}

	private static boolean haveThree(int[] nums) {
		
		if(nums.length >= 5) {
			
			for(int i=0; i<nums.length; i++) {
				
				// first 3
				if(nums[i] == 3) {
					
					for(int j=i+1; j<nums.length; j++) {
						
						// second 3
						if(nums[j] == 3) {
							
							if(j == i+1) {
								
								return false;
								
							}
							
							for(int k=j+1; k<nums.length ;k++) {
								
								// third 3
								if(nums[k] == 3) {
									
									if(k==j+1) {
										
										return false;
										
									}
									
									for(int l=k+1; l<nums.length; l++) {
										
										if(nums[l] == 3) {
											
											return false;
											
										}
										
									}
									
									return true;
								}
								
								
							}
						}
					}
					
				}
				
			}
			
		}
		
		return false;
		
	}

	/*
	private static boolean helpHaveThree(int index, int count, int[] nums) {

		if(count > 3) {
			
			return false;
		}
		
		return false;
	}
	*/

}
