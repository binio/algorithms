package com.binio.algo.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzExcersiseTest {

    @Test
    public void fb() {
        assertEquals("123FIZZ4", FizzBuzzExcersise.fb(4));
        assertEquals("12", FizzBuzzExcersise.fb(2));
        assertEquals("123FIZZ45BUZZ6FIZZ789FIZZ10BUZZ1112FIZZ131415FIZZBUZZ16", FizzBuzzExcersise.fb(16));
        assertEquals("1", FizzBuzzExcersise.fb(1));
    }

    @Test
    public void fbV2() {
        assertEquals("123FIZZ4", FizzBuzzExcersise.fbV2(4));
        assertEquals("12", FizzBuzzExcersise.fbV2(2));
        assertEquals("123FIZZ45BUZZ6FIZZ789FIZZ10BUZZ1112FIZZ131415FIZZBUZZ16", FizzBuzzExcersise.fbV2(16));
        assertEquals("1", FizzBuzzExcersise.fbV2(1));
    }
}