package com.lambda_or_functional_1_and_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Source: https://codingbat.com/prob/p117665
 * Given a list of integers, return a list where each integer is multiplied by 2.


doubling([1, 2, 3]) → [2, 4, 6]
doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
doubling([]) → []

 */
public class Doubling {
    public static List<Integer> doubling(List<Integer> nums) {

        nums.replaceAll(n -> n*2);
        return nums;

    }
    public static void main(String[] args) {
       /**
        *   List<Integer> nums = new ArrayList<Integer>(){
            {
                add(1);
                add(2);
                add(3);
            }
        };
        */

        List<Integer> nums = Arrays.asList(1, 2, 3);
        System.out.println(nums);
        System.out.println(doubling(nums));
    }
}
