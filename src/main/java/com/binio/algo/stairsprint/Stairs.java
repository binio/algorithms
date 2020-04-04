package com.binio.algo.stairsprint;

public class Stairs {

    /*
        '#  '
        '## '
        '###'
    we want to print steps as abobe with steps numbers
     */
    public static String printStairs(int steps) {
        String stairs = "#";
        StringBuffer buffer = new StringBuffer();

        //first for loop goes through rows
        for(int i=0; i<steps; i++) {
            buffer.append("'");

            //second for loop goes through columns
            //if row >= column we draw step
            //else we draw space ' '
            for(int k=0; k<steps; k++){
                if(i>=k) {
                    buffer.append("#");

                } else {
                    buffer.append(" ");
                }
            }

        //moving to next row we need to append new line char \n
        buffer.append("'\n");
        }
        //System.out.println(buffer.toString());
        return buffer.toString();
    }

    public static String printStairsV2(int steps, int count, StringBuffer buffer) {
        if(steps != 0) {
            buffer.append("'");

            for (int i = 0; i <= count; i++) {
                buffer.append('#');
            }
            for (int r = 0; r < steps-1 ; r++) {
                buffer.append(' ');
            }

            buffer.append("'\n");

            printStairsV2(steps - 1, count + 1, buffer);
        }
        return buffer.toString();
    }
}
