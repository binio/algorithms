package com.binio.algo.ngram;

import java.util.ArrayList;
import java.util.List;

public class Ngram {

    String text = "Mary had a little lamb its fleece was white as snow;\n" +
            "And everywhere that Mary went, the lamb was sure to go.\n" +
            "It followed her to school one day, which was against the rule;\n" +
            "It made the children laugh and play, to see a lamb at school.\n" +
            "And so the teacher turned it out, but still it lingered near,\n" +
            "And waited patiently about till Mary did appear.\n" +
            "\"Why does the lamb love Mary so?\" the eager children cry;\"Why, Mary loves the lamb, you know\" the teacher did reply.\"";
//    String text = "ONE TWO ONE TWO THREE TWO THREE";


    public String get(int count, String word) {
        List<String> grams = ngrams(count, text);
        System.out.println(grams);
        return " ";
    }


    public void ngrams1(int n, String str){

    }
    public  List<String> ngrams(int n, String str) {
        List<String> ngrams = new ArrayList<String>();
        for (int i = 0; i < str.length() - n + 1; i++)
            ngrams.add(str.substring(i, i + n));

        return ngrams;
    }
}
