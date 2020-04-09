package com.binio.algo.findprice;

import static org.junit.Assert.*;

import org.junit.Test;

public class PriceFindTest {

    @Test
    public void find() {
        int[][] input = {{0,4,5},{2,8,3},{7,11,10}};
        int[][] expected = {{0,2,5},{2,8,3},{8,11,10}};
        assertArrayEquals(expected, PriceFind.find(input));
    }
}