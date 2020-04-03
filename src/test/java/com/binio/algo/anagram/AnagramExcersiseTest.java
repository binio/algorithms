package com.binio.algo.anagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramExcersiseTest {

    @Test
    public void check() {
        String[] arr = {"DOM", "TDIO AS BUBA", "DOMIO"};
        String[] arr1= {"DOM", "AAA", "DOAAA"};
        String[] arr2 = {"DDOM", "DOMU", "DOMD"};
        String[] arr3 = {"AAA", "TDIO", "DOMIO", "ODM"};
        assertEquals(true, AnagramExcersise.check("MOD", arr));
        assertEquals(false, AnagramExcersise.check("MODA", arr1));
        assertEquals(false, AnagramExcersise.check("MOD", arr2));
        assertEquals(true, AnagramExcersise.check("MOD", arr3));
    }
}