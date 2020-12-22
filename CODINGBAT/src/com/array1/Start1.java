package com.array1;

/**
 * 
 * Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as 
 * their first element.


start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1

 * 
 * @author rdarshan
 *
 */
public class Start1 {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 3};
		int[] b = {1, 3};
		
		System.out.println(start1(a, b));
	}

	private static int start1(int[] a, int[] b) {
		
		int count = 0;
		
		if(a.length == 0 && b.length == 0) return 0;
		
		if(a.length == 0 && b.length != 0) {
			
			count = calArrStart1(b);
			
		} else if(a.length != 0 && b.length == 0) {
			
			count = calArrStart1(a);
			
		} else {
				
				count+=calArrStart1(a);
				
				count+=calArrStart1(b);
				
		}
		
		return count;
	}

	private static int calArrStart1(int[] arr) {

		if(arr[0] == 1) return 1;
		
		return 0;
	}

}
