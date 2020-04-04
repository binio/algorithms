package com.binio.algo.palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeExcersiseTest {

    @Test
    public void checkPalindrome() {

            assertTrue (PalindromeExcersise.checkPalindrome("ANNA"));
            assertTrue (PalindromeExcersise.checkPalindrome("ANSNA"));
            assertFalse (PalindromeExcersise.checkPalindrome("BANNA"));
            assertFalse (PalindromeExcersise.checkPalindrome("TOMASZ"));
            assertTrue (PalindromeExcersise.checkPalindrome("ANA"));
            assertTrue (PalindromeExcersise.checkPalindrome("123321"));
    }

    @Test
    public void checkPalindromeV2() {

        assertTrue (PalindromeExcersise.checkPalindromeV2("ANNA"));
        assertTrue (PalindromeExcersise.checkPalindromeV2("ANSNA"));
        assertFalse (PalindromeExcersise.checkPalindromeV2("BANNA"));
        assertFalse (PalindromeExcersise.checkPalindromeV2("TOMASZ"));
        assertTrue (PalindromeExcersise.checkPalindromeV2("ANA"));
        assertTrue (PalindromeExcersise.checkPalindromeV2("123321"));
    }
}