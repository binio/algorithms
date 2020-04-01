package com.binio.algo.maxchar;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxCharTest {

    @Test
    public void findMaxChar() {
        assertEquals('c', MaxChar.findMaxChar("circularc"));
        assertEquals('i', MaxChar.findMaxChar("bilirubina"));
        assertEquals('o', MaxChar.findMaxChar("Haloooo"));
    }
}