package com.binio.algo.capitalize;

import java.util.ArrayList;
import java.util.Arrays;

public class Sentence {

    public static String capitalize(String input) {
        String[] words = input.split("\\s");

        StringBuffer buffer = new StringBuffer();
        Arrays.asList(words).stream().forEach( w -> {
            buffer.append(upCaseFirst(w) + " ");
        });

        return buffer.toString().trim();
    }

    public static String capitalizeV2(String input) {
        String[] words = input.split("\\s");

        ArrayList<String> wordsArr = new ArrayList<>();
        Arrays.asList(words).stream().forEach( w -> {
            wordsArr.add(upCaseFirst(w));
        });

        return String.join(" ",wordsArr);
    }

    public static String upCaseFirst(String word) {
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }
}
