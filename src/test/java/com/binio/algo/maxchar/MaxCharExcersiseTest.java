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
}