package com.array1;

import java.util.Arrays;

/**
 * 
 * Given 2 int arrays, a and b, return a new array length 2 containing, as much
 * as will fit, the elements from a followed by the elements from b. The arrays
 * may be any length, including 0, but there will be 2 or more elements
 * available between the 2 arrays.
 * 
 * 
 * make2([4, 5], [1, 2, 3]) → [4, 5] make2([4], [1, 2, 3]) → [4, 1] make2([],
 * [1, 2]) → [1, 2]
 * 
 * @author rdarshan
 *
 */
public class Make2 {

	public static void main(String[] args) {

		int[] a = { 4 };
		int[] b = { 1, 2, 3 };

		System.out.println(Arrays.toString(make2(a, b)));

	}

	private static int[] make2(int[] a, int[] b) {

		int[] result = new int[2];

		if (a.length == 0 && b.length == 0) {

			return result;

		}

		if (a.length == 0 && b.length != 0) {

			result[0] = b[0];

			if (b.length >= 2) {

				result[1] = b[1];

			}

			return result;

		} else {

			int count = 0;

			for (int i = 0; i < result.length; i++) {

				if (count == a.length) {

					result[i] = b[0];
					
					return result;
					
				}

				result[i] = a[i];
				
				count++;

				if (count == 2)
					return result;
			}

		}

		return a;
	}

}
