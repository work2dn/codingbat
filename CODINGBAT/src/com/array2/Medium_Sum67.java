package com.array2;

/**
 * Return the sum of the numbers in the array, except ignore sections of numbers
 * starting with a 6 and extending to the next 7 (every 6 will be followed by at
 * least one 7).
 * 
 * Return 0 for no numbers.
 * 
 * 
 * sum67([1, 2, 2]) → 5 sum67([1, 2, 2, 6, 99, 99, 7]) → 5 sum67([1, 1, 6,7,2])→
 * 4 sum67([1, 6, 2, 2, 7, 1, 6, 99, 99, 7]) → 2 sum67([2, 7, 6, 2, 6, 7,2, 7])
 * → 18
 * 
 * 
 * @author rdarshan
 *
 */
public class Medium_Sum67 {

	public static void main(String[] args) {

		int[] nums = { 2, 7, 6, 2, 6, 7, 2, 7 };

		System.out.println(sum67(nums));

	}

	private static int sum67(int[] nums) {

		return helperSum67(nums, 0);

	}

	private static int helperSum67(int[] nums, int index) {

		if (index == nums.length - 1)
			return nums[index];

		int index6 = -1, index7 = -1, sum = 0;

		// code to find index of 6
		for (int i = index; i < nums.length; i++) {

			if (nums[i] == 6) {

				index6 = i;
				// break after finding the first index of 6
				break;

			}

			sum += nums[i];

		}

		// if 6 absent in array return the total sum
		if (index6 == -1) {

			return sum;

		} else {
			// code to find index of 7 after 6
			for (int j = index6 + 1; j < nums.length; j++) {

				if (nums[j] == 7) {

					index7 = j;

					// break after finding the first index of 7
					break;

				}
			}
		}

		return sum + helperSum67(nums, index7 + 1);
	}

// BELOW IS ANOTHER SOLUTION

	public int sum67_2ND(int[] nums) {
		int sum = 0;
		int annul7 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 6) {
				for (int j = i; nums[j] != 7; j++) {
					nums[j] = 0;
					annul7 = j;
				}
				nums[annul7 + 1] = 0;
			} else
				sum += nums[i];
		}
		return sum;
	}

}
