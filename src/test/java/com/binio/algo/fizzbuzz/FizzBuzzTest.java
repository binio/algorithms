package com.binio.algo.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void fb() {
        assertEquals("123FIZZ4", FizzBuzz.fb(4));
        assertEquals("12", FizzBuzz.fb(2));
        assertEquals("123FIZZ45BUZZ6FIZZ789FIZZ10BUZZ1112FIZZ131415FIZZBUZZ16", FizzBuzz.fb(16));
        assertEquals("1", FizzBuzz.fb(1));
    }
}