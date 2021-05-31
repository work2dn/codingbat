package com.lambda_or_functional_1_and_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 
Given a list of integers, return a list of the integers, omitting any that are less than 0.


noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []
-----------------------------------------------------
https://codingbat.com/prob/p124510

Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)


no9([1, 2, 19]) → [1, 2]
no9([9, 19, 29, 3]) → [3]
no9([1, 2, 3]) → [1, 2, 3]


-----------------------------------------------------
https://codingbat.com/prob/p137274

Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.


noTeen([12, 13, 19, 20]) → [12, 20]
noTeen([1, 14, 1]) → [1, 1]
noTeen([15]) → []

 */
public class NoNeg {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, -2, -5, -7);
        System.out.println("Original: " + list);
        System.out.println("Result: " + noNeg(list));

        List<Integer> list2 = Arrays.asList(9, 19, 29, 3);
        System.out.println("\nOriginal: " + list2);
        System.out.println("Result: " + no9(list2));

        List<Integer> list3 = Arrays.asList(12, 13, 19, 2);
        System.out.println("\nOriginal: " + list3);
        System.out.println("Result: " + noTeen(list3));

        
    }

    private static List<Integer> noTeen(List<Integer> list3) {
        return list3.stream().filter(n -> n<13 || n>19).collect(Collectors.toList());
    }

    private static List<Integer> no9(List<Integer> list) {
        return list.stream().filter(n -> n%10!=9).collect(Collectors.toList());
    }

    private static List<Integer> noNeg(List<Integer> list) {

        return list.stream().filter(n -> n>0).collect(Collectors.toList());
    }
}
