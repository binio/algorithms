package com.binio.algo.anagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

    @Test
    public void check() {
        String[] arr = {"DOM", "TDIO", "DOMIO"};
        String[] arr1= {"DOM", "AAA", "DOAAA"};
        String[] arr2 = {"DDOM", "DOMU", "DOMD"};
        String[] arr3 = {"AAA", "TDIO", "DOMIO", "ODM"};
        assertEquals(true, Anagram.check("MOD", arr));
        assertEquals(false, Anagram.check("MODA", arr1));
        assertEquals(false, Anagram.check("MOD", arr2));
        assertEquals(true, Anagram.check("MOD", arr3));
    }
}