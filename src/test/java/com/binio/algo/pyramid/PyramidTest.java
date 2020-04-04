package com.binio.algo.pyramid;

import static org.junit.Assert.*;

import com.binio.algo.stairsprint.Stairs;
import org.junit.Test;

public class PyramidTest {

    @Test
    public void draw() {
            String expected = "--#--\n-###-\n#####\n";
            assertEquals(expected, Pyramid.draw(4,1, new StringBuffer()));
    }
}