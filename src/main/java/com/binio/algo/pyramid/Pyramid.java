package com.binio.algo.pyramid;

public class Pyramid {



    public static String draw(int levels, int start, StringBuffer buffer) {
        if(levels > start) {
            int numOfSteps = (start * 2) -1;
            int colCount = (levels * 2) -1;
            int padding = (colCount - numOfSteps)/2;
            buffer.append(getLeftRightPadding(padding));
            buffer.append(getSteps(numOfSteps));
            buffer.append(getLeftRightPadding(padding));
            buffer.append("\n");

            draw(levels , start + 1, buffer);
        }
        return buffer.toString();
    }

    public static String getLeftRightPadding(int padding) {
        StringBuffer pads = new StringBuffer();
        for(int i=1; i<padding; i++) {
            pads.append("-");
        }
        return pads.toString();
    }

    public static String getSteps(int steps) {
        StringBuffer pads = new StringBuffer();
        for(int i=0; i<steps; i++) {
            pads.append("#");
        }
        return pads.toString();
    }
}

/*
lev 1 => 1 #
lev 2 => 3 #
lev 3 => 5 #

so number of  # depending on level is (level * 2)-1
nubmer of columns will be (levels * 2)-1
padding ' ' will be (columnsNumber - number of # for the level) /2
 */
