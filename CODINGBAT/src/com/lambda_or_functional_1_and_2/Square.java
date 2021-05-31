package com.lambda_or_functional_1_and_2;

import java.util.Arrays;
import java.util.List;

public class Square {

    public static List<Integer> square(List<Integer> input) {

        input.replaceAll(n->n*n);

        return input;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5);
        System.out.println("Original: " + list);
        System.out.println("Result: " + square(list));
    }
}
