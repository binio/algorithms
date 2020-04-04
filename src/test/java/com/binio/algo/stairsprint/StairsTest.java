package com.binio.algo.stairsprint;

import static org.junit.Assert.*;

import org.junit.Test;

public class StairsTest {

    @Test
    public void printStairs() {
        String expected = "'#  '\n'## '\n'###'\n";
        assertEquals(expected, Stairs.printStairs(3));
    }

    @Test
    public void printStairsV2() {
        String expected = "'#  '\n'## '\n'###'\n";
        assertEquals(expected, Stairs.printStairsV2(3, 0, new StringBuffer()));
    }
}