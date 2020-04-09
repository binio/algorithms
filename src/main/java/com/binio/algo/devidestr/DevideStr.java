package com.binio.algo.devidestr;

import java.util.ArrayList;
import java.util.List;

public class DevideStr {

    /*
    Given an input string, divide it into substrings where each substring contains the longest
    continuous string of the same character and output a string with the character for each
    substring and the length of the respective substring
     */
    public static String[] devide(String input) {
        char[] inputArr = input.toCharArray();
        List<String> strList = new ArrayList();
        StringBuffer buffer = new StringBuffer();

        for(int i = 0; i<inputArr.length; i++) {
            if(i+1<inputArr.length && inputArr[i] == inputArr[i+1] || (i!=0 && inputArr[i]==inputArr[i-1]) ) {
                buffer.append(inputArr[i]);
            } else {
                strList.add(buffer.toString());
                buffer.delete(0, buffer.length());
            }
        }
        strList.add(buffer.toString());



        strList.toString();

        strList.stream().filter(o -> !o.equals("")).forEach(o-> System.out.println(o + "- " + o.toCharArray().length) );
        return null;
    }
}
