package com.binio.algo.stringrev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RevString {

    public static String reverse(String string) {
        char[] input = string.toCharArray();
        char[] result = new char[input.length];

        for(int i = 0; i < input.length; i++) {
            result[i] = input[input.length -1 - i];
        }
        return new String(result);
    }

    public static String reverseV2(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static String reverseV3(String string) {
        char[] input = string.toCharArray();
        List<Character> charList = new ArrayList<>();
        for(char i : input) {
            charList.add(i);
        }
        Collections.reverse(charList);
        return charList.stream().map(a -> a.toString()).collect(Collectors.joining(""));

    }


}
