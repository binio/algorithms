package com.binio.algo.spiralmatrix;

public class SpiralMtx {

    public static int[][] create(int level) {

        //create holding matrix
        int container[][] = new int[level][level];

        int counter = 1;
        int startColumn = 0;
        int endColumn = level - 1;
        int startRow = 0;
        int endRow = level - 1;

        while(startColumn <= endColumn && startRow <= endRow) {
            //top row
            for(int i=startColumn; i<=endColumn; i++){
                container[startColumn][i] = counter;
                counter++;
            }
            startRow++;

            //right column
            for(int i=startRow; i<=endRow; i++){
                container[i][endColumn] = counter;
                counter++;
            }
            endColumn--;

            //bottom row
            for(int i = endColumn; i>= startColumn; i--) {
                container[endRow][i] = counter;
                counter++;
            }
            endRow--;

            //start column
            for(int i = endRow; i>= startRow; i--) {
                container[i][startColumn] = counter;
                counter++;
            }
            startColumn++;

            //fill in loop
            int numOfElements = level * level;
            for(int i=1; i<numOfElements; i++) {

            }
        }
        return container;
    }
}
