package com.binio.algo.palindrome;

import static org.junit.Assert.*;

import com.binio.algo.stringrev.RevString;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void checkPalindrome() {
        assertTrue (Palindrome.checkPalindrome("ANNA"));
        assertTrue (Palindrome.checkPalindrome("ANSNA"));
        assertFalse (Palindrome.checkPalindrome("BANNA"));
        assertFalse (Palindrome.checkPalindrome("TOMASZ"));
        assertTrue (Palindrome.checkPalindrome("ANA"));
        assertTrue (Palindrome.checkPalindrome("123321"));
    }

    @Test
    public void checkPalindromeV2() {
        assertTrue (Palindrome.checkPalindromeV2("ANNA"));
        assertTrue (Palindrome.checkPalindromeV2("ANSNA"));
        assertFalse (Palindrome.checkPalindromeV2("BANNA"));
        assertFalse (Palindrome.checkPalindromeV2("TOMASZ"));
        assertTrue (Palindrome.checkPalindromeV2("ANA"));
        assertTrue (Palindrome.checkPalindromeV2("123321"));
    }
}