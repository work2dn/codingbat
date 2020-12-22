package com.array2;

/**
 * 
 * Given an array of ints, return true if the array contains two 7's next to each other, 
 * or there are two 7's separated by one element, such as with {7, 1, 7}.


has77([1, 7, 7]) → true
has77([1, 7, 1, 7]) → true
has77([1, 7, 1, 1, 7]) → false
 * 
 * @author rdarshan
 *
 */
public class Medium_Has77 {

	public static void main(String[] args) {

		int[] nums = {1, 7, 7};
		
		System.out.println(has77(nums));
		
	}

	private static boolean has77(int[] nums) {
		
		if(nums.length < 2) {
			
			return false;
			
		}
		
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i] ==  7) {
				
				if(i+1 < nums.length && nums[i+1] == 7) {
					
					return true;
					
				}
				
				if(i+2 < nums.length && nums[i+1] != 7 && nums[i+2] == 7) {
					
					return true;
					
				}
			}
			
		}
		
		return false;
		
	}
	
	// below is another solution
	public boolean has77_2nd(int[] nums) {  
		  if (nums.length < 2)
		    return false;
		  
		  for (int i = 0; i < nums.length; i++) {
		    if (nums[i] == 7 && i < nums.length-1 && nums[i+1] == 7)
		      return true;
		    if (nums[i] == 7 && i < nums.length-2 && nums[i+2] == 7)
		      return true;  
		  }
		  return false;
		}

}
