package com.binio.algo.maxchar;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxChar {

    /*
    does not take into account that two or more chars can score the same eg. ABBA
     */
    public static char findMaxChar(String input) {
        char[] inputArr = input.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
        char maxCharacter = ' ';

        for(char a:inputArr){
            if(charMap.containsKey(a)) {
                charMap.put(a, charMap.get(a) + 1);
            }

            charMap.putIfAbsent(a,1);
        }
        Integer maxOccurrences = Integer.valueOf(Collections.max(charMap.values())); //sort of..

        List<Character> result = charMap.entrySet()
                .stream()
                .filter(entry -> maxOccurrences.equals(entry.getValue()))
                .map(Map.Entry::getKey).collect(Collectors.toList());
        return result.get(0);
    }
}
