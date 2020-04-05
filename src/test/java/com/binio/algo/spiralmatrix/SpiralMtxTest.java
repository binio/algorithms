package com.binio.algo.spiralmatrix;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpiralMtxTest {

    @Test
    public void create() {
        int[][] expected = new int[4][];
        int[]  row1 = {1, 2, 3, 4};
        int[]  row2 = {12,13,14,5};
        int[]  row3 = {11,16,15,6};
        int[]  row4 = {10, 9, 8,7};
        expected[0] = row1;
        expected[1] = row2;
        expected[2] = row3;
        expected[3] = row4;

        assertArrayEquals(expected, SpiralMtx.create(4));
    }
}