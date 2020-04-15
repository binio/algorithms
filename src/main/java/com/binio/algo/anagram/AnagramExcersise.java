package com.binio.algo.anagram;

import java.util.Arrays;

public class AnagramExcersise {

    public static boolean check(String a, String[] b) {
        for(String word:b) {
            if(checkAnagram(a,word)) {
                return true;
            }
        }
        return false;

    }

    //complete the body of the method
    public static boolean checkAnagram(String a, String b) {
        //complete body! take 1
//        String copyOfA = a.replaceAll("\\s", "");
//        String copyOfB = b.replaceAll("\\s", "");
//
//        boolean isAnagram = false;
//
//        if(copyOfA.length() != copyOfB.length()) {
//            isAnagram = false;
//        } else {
//            char[] arrayA = copyOfA.toCharArray();
//            char[] arrayB = copyOfB.toCharArray();
//
//            Arrays.sort(arrayA);
//            Arrays.sort(arrayB);
//
//            isAnagram =  Arrays.equals(arrayA,arrayB);
//        }
//
//        return isAnagram;
        boolean isAnagram = false;
        String copyOfA = a.replace("\\s","");
        String copyOfB = b.replace("\\s","");

        if(copyOfA.length()!= copyOfB.length()){
            return false;
        } else {
            char[] arrayA = copyOfA.toCharArray();
            char[] arrayB = copyOfB.toCharArray();

            Arrays.sort(arrayA);
            Arrays.sort(arrayB);

            isAnagram =  Arrays.equals(arrayA,arrayB);
        }


        return isAnagram;
    }
}
