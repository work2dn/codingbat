package com.lambda_or_functional_1_and_2;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * Source: https://codingbat.com/prob/p170181
 * 
 * Given a list of strings, return a list where each string has "*" added at its end.


addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) → ["hello*", "there*"]
addStar(["*"]) → ["**"]
 */
public class AddStar{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "bb", "ccc");
        System.out.println("Original: " + list);
        System.out.println("Result: " + addStar(list));

    }

    private static List<String> addStar(List<String> list) {
        list.replaceAll(str->str+"*");
        return list;
    }
}
