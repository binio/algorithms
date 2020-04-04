package com.binio.algo.maxchar;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxCharExcersiseTest {

    @Test
    public void findMaxChar() {
        assertEquals('c', MaxCharExcersise.findMaxChar("circularc"));
        assertEquals('i', MaxCharExcersise.findMaxChar("bilirubina"));
        assertEquals('o', MaxCharExcersise.findMaxChar("Haloooo"));
    }

    @Test
    public void findMaxCharV2() {
        assertEquals('c', MaxCharExcersise.findMaxCharV2("circularc"));
        assertEquals('i', MaxCharExcersise.findMaxCharV2("bilirubina"));
        assertEquals('o', MaxCharExcersise.findMaxCharV2("Haloooo"));
    }
}