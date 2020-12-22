package com.array2;

/**
 * 
 * Given an array of ints, return true if there is a 1 in the array with a 2
 * somewhere later in the array.
 * 
 * 
 * has12([1, 3, 2]) → true has12([3, 1, 2]) → true has12([3, 1, 4, 5, 2]) → true
 * 
 * @author rdarshan
 *
 */
public class Has12 {

	public static void main(String[] args) {

		int[] nums = { 1, 2 };

		System.out.println(has12(nums));

	}

	private static boolean has12(int[] nums) {

		if (nums.length >= 2) {

			for (int i = 0; i < nums.length; i++) {

				if (nums[i] == 1) {

					for (int j = i + 1; j < nums.length; j++) {

						if (nums[j] == 2) {

							return true;

						}

					}

				}

			}
		}

		return false;
	}

	// ANOTHER SOLUTION
	public boolean has12_ANOTHER(int[] nums) {
		boolean foundOne = false;
		boolean foundOneTwo = false;

		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == 1)
				foundOne = true;
			
			if (nums[i] == 2 && foundOne)
				foundOneTwo = true;
			
		}
		
		return foundOneTwo;
		
	}

}
