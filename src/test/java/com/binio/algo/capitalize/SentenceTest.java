package com.binio.algo.capitalize;

import static org.junit.Assert.*;

import org.junit.Test;

public class SentenceTest {

    @Test
    public void capitalize() {
        String input = "there is a fire in the house";
        String expected = "There Is A Fire In The House";

        assertEquals(expected,Sentence.capitalize(input));
    }

    @Test
    public void capitalizeV2() {
        String input = "there is a fire in the house";
        String expected = "There Is A Fire In The House";

        assertEquals(expected,Sentence.capitalizeV2(input));
    }
}