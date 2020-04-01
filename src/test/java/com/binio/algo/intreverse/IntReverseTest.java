package com.binio.algo.intreverse;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntReverseTest {

    @Test
    public void reverse() {
        assertEquals(321, IntReverse.reverse(123));
        assertEquals(-321, IntReverse.reverse(-123));
        assertEquals(7, IntReverse.reverse(700));
        assertEquals(-7, IntReverse.reverse(-700));
    }

    @Test
    public void reverseV2() {
        assertEquals(321, IntReverse.reverseV2(123));
        assertEquals(-321, IntReverse.reverseV2(-123));
        assertEquals(7, IntReverse.reverseV2(700));
        assertEquals(-7, IntReverse.reverseV2(-700));
    }
}