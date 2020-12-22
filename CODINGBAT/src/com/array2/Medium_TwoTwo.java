package com.array2;

/**
 * 
 * Given an array of ints, return true if every 2 that appears in the array is
 * next to another 2.
 * 
 * 
 * twoTwo([4, 2, 2, 3]) → true 
 * twoTwo([2, 2, 4]) → true 
 * twoTwo([2, 2, 4, 2]) → false
 * 
 * 
 * @author rdarshan
 *
 */
public class Medium_TwoTwo {

	public static void main(String[] args) {

		int[] nums = { 2, 2, 4, 2};

		System.out.println(twoTwo(nums));

	}

	private static boolean twoTwo(int[] nums) {


		if(nums.length == 0) return true;
		
		if(nums.length == 1) {
			
			if(nums[0] == 2) {
				
				return false;
				
			} else {
				
				return true;
				
			}
			
			
		} 
		
		for (int i = 1; i < nums.length; i++) {

			if (nums[i] == 2) {

				if (nums[i - 1] == 2 || (i+1 < nums.length && nums[i + 1] == 2)) {
					
					
				} else {
					
					return false;
					
				}
				
				

			}
		}

		return true;

	}
	
	
	// Another solution
	
	/* Given an array of ints, return true if every 2 that appears in the array 
	 * is next to another 2.
	 */
	
	public boolean twoTwo_Another(int[] nums) {
	    if(nums.length == 1 && nums[0] == 2)
	        return false;
	          
	    if(nums.length >= 2 && ((nums[0] == 2 && nums[1] != 2) ||
	        (nums[nums.length-1] == 2 && nums[nums.length-2] != 2)))
	        return false;
	                            
	    for(int i = 1; i <= nums.length - 2; i++) {
	        if(nums[i] == 2 && nums[i-1] != 2 && nums[i+1] != 2)
	            return false;
	    }
	                                            
	    return true;
	}

}
