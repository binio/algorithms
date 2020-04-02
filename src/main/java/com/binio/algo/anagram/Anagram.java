package com.binio.algo.anagram;

import java.util.Arrays;

public class Anagram {

    public static boolean check(String a, String[] b) {
    for(String word:b) {
        if(checkAnagram(a,word)) {
            return true;
        }
    }
    return false;

    }

    public static boolean checkAnagram(String a, String b) {
        String copyOfa = a.replaceAll("\\s", "");
        String copyOfb = b.replaceAll("\\s", "");
        boolean isAnagram = false;
        if(copyOfa.length() != copyOfb.length()) {
            isAnagram = false;
        } else {
            char[] s1Array = copyOfa.toLowerCase().toCharArray();
            char[] s2Array = copyOfb.toLowerCase().toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            isAnagram = Arrays.equals(s1Array, s2Array);
        }
        return isAnagram;

    }
}
