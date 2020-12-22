package com.array1;

/**
 * 
 * Given an array of ints of odd length, look at the first, last, and middle values in the 
 * array and return the largest. The array length will be a least 1.


maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
 * 
 * @author rdarshan
 *
 */
public class MaxTriple {

	public static void main(String[] args) {

	int[] nums = {0, 2, 2};
	
	System.out.println(maxTriple(nums));
		
	}

	private static int maxTriple(int[] nums) {
		
		if(nums.length == 1) return nums[0];
		
		int middle_index = nums.length/2;
		
		int first = nums[0];
		int last = nums[nums.length - 1];
		int middle = nums[middle_index];
		
		if(first > middle && first > last) {
			
			return first;
			
		} else if(middle > first && middle > last) {
			
			return middle;
			
		} else if(last > first && last > middle) {
			
			return last;
			
		} else if(first == middle && first > last) {
			
			return first;
			
		} else if(first == middle && first < last) {
			
			return last;
			
		} else if(middle == last && middle > first) {
			
			return middle;
			
		} else if(middle == last && middle < first) {
			
			return first;
			
		} else if(first == last && first > middle) {
			
			return first;
			
		} else if(first == last && first < middle) {
			
			return middle;
			
		} else {
			
			return first;
			
		}
		
		
	}

}
