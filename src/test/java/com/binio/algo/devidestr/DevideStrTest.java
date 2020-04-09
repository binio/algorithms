package com.binio.algo.devidestr;

import static org.junit.Assert.*;

import org.junit.Test;

public class DevideStrTest {

    @Test
    public void devide() {
        String input = "oaaabcdeeeeefghhhijkllljkk";
        String[] expected = {"aaa","eee", "hhh", "lll"};

        assertArrayEquals(expected, DevideStr.devide(input));
    }
}