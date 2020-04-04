package com.binio.algo.maxchar;

import java.util.HashMap;
import java.util.Map;

public class MaxCharExcersise {

    public static char findMaxChar(String input) {
        char[] inputArr = input.toCharArray();
        HashMap<Character,Integer> counter = new HashMap<>();
        int maxCount = 0;
        char maxChar = ' ';

        for(int i=0; i<inputArr.length; i++) {
            if(counter.containsKey(inputArr[i])){
                counter.put(inputArr[i], counter.get(inputArr[i]) + 1);
            } else {
                counter.putIfAbsent(inputArr[i], 1);
            }
        }

        for(Map.Entry<Character,Integer> entry : counter.entrySet()) {
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }


        return maxChar;
    }
}
