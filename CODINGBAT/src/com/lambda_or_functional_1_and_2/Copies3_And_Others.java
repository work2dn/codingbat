package com.lambda_or_functional_1_and_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 
Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.


copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
copies3(["24", "a", ""]) → ["242424", "aaa", ""]
copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]


https://codingbat.com/prob/p177528
Given a list of strings, return a list where each string has "y" added at its start and end.


moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
moreY(["yay"]) → ["yyayy"]


https://codingbat.com/prob/p152194

Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)


rightDigit([1, 22, 93]) → [1, 2, 3]
rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
rightDigit([10, 0]) → [0, 0]


Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)



https://codingbat.com/prob/p105671
noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) → ["hi"]
noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
 */
public class Copies3_And_Others {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "bb", "ccc");
        System.out.println("Original: " + list);
        System.out.println("Result 1: " + copies3(list));

        System.out.println("Result 2: " + moreY(list));

        List<Integer> listNum = Arrays.asList(10, 22, 38);
        System.out.println("\nOriginal: " + listNum);
        System.out.println("Result 3: " + rightDigit(listNum));


        List<String> list4 = Arrays.asList("aaa", "bbb", "aza");
        System.out.println("\nOriginal: " + list4);
        System.out.println("Result 4: " + noZ(list4));

    }

    public static  List<String> noZ(List<String> strings) {
  
        // strings.removeIf(s-> s.contains("z"));
        // return strings;
        return strings.stream()
                            .filter(s -> !s.contains("z"))
                            .collect(Collectors.toList());
        
      }
      
    private static List<Integer> rightDigit(List<Integer> listNum) {

        listNum.replaceAll(n->n%10);
        
        return listNum;
    }

    public static List<String> moreY(List<String> strings) {

        strings.replaceAll(s -> "y"+s+"y");
        return strings;
    }
    private static List<String> copies3(List<String> list) {
        list.replaceAll(str -> str+str+str);
        return list;
    }
}
