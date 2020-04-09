package com.binio.algo.ngram;

import static org.junit.Assert.*;

import org.junit.Test;

public class NgramTest {


    @Test
    public void get() {
        Ngram ng = new Ngram();
        String input = "the";
        int count = 2;
        String expected = "lamb,0.375;teacher,0.250;children,0.125;eager,0.125;rule,0.125";

        assertEquals(expected, ng.get(count,input));
    }
}