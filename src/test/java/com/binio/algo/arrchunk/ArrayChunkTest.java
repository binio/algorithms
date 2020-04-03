package com.binio.algo.arrchunk;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayChunkTest {

    @Test
    public void chunk() {
        int[] input = {2,3,4,5,6,76,1};
        int[][] expected = {{2,3},{4,5},{6,76},{1}};
        assertArrayEquals(expected, ArrayChunk.chunk(input, 2));
    }
}