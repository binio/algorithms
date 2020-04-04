package com.binio.algo.stairsprint;

import static org.junit.Assert.*;

import org.junit.Test;

public class StairsTest {

    @Test
    public void printStairs() {
        String expected = "'#  '\n'## '\n'###'\n";
        assertEquals(expected, Stairs.printStairs(3));
    }
}