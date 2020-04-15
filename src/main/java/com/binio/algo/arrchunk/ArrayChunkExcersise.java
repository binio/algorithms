package com.binio.algo.arrchunk;

import java.util.Arrays;

public class ArrayChunkExcersise {

    //complete the method
    public static int[][] chunk(int[] arrayToSplit, int chunkSize) {
        String info1 = "take 1";
//        int rest = arrayToSplit.length % chunkSize;
//        int sizeOfNewArray = arrayToSplit.length/chunkSize + (rest == 0 ? 0:1);
//        int[][] newArray = new int[sizeOfNewArray][];
//
//        for(int i=0; i< (rest > 0 ? sizeOfNewArray-1:sizeOfNewArray); i++){
//            newArray[i] = Arrays.copyOfRange(arrayToSplit, i*chunkSize, i*chunkSize + chunkSize);
//        }
//
//        if(rest > 0){
//            newArray[sizeOfNewArray-1] = Arrays.copyOfRange(arrayToSplit, (sizeOfNewArray - 1) * chunkSize, (sizeOfNewArray - 1) * chunkSize + rest);
//        }
//
//        return newArray;

        String info2 = "take 2";
//        int rest = arrayToSplit.length % chunkSize;
//        int newArraySize = arrayToSplit.length/chunkSize + (rest>0? 1 : 0);
//        int[][] newArray = new int[newArraySize][];
//
//        for(int i=0; i<(rest >0 ? newArraySize-1 : newArraySize); i++) {
//            newArray[i] = Arrays.copyOfRange(arrayToSplit, i * chunkSize, i * chunkSize + chunkSize);
//        }
//
//        if(rest>0){
//            newArray[newArraySize-1] = Arrays.copyOfRange(arrayToSplit, (newArraySize - 1) * chunkSize, (newArraySize - 1) * chunkSize + rest);
//        }
//        return newArray;

        String info3 = "take 3";

//        int rest = arrayToSplit.length % chunkSize;
//        int newArrayLength = arrayToSplit.length / chunkSize + (rest > 0 ? 1:0);
//        int[][] newArray = new int[newArrayLength][];
//
//        for(int i=0; i<(rest > 0 ? newArrayLength -1 : newArrayLength); i++) {
//            newArray[i] = Arrays.copyOfRange(arrayToSplit, i*chunkSize, i*chunkSize + chunkSize);
//        }
//
//        if(rest > 0) {
//            newArray[newArrayLength-1] = Arrays.copyOfRange(arrayToSplit, (newArrayLength-1)*chunkSize, (newArrayLength-1)*chunkSize + rest);
//
//        }
//        return newArray;

        String info4 = "take 4";

        int rest = arrayToSplit.length % chunkSize;
        int newArraySize = arrayToSplit.length / chunkSize + (rest > 0? 1:0);
        int[][] newArray = new int[newArraySize][];

        for(int i=0; i<(rest>0? newArraySize - 1: newArraySize); i++) {
            newArray[i] = Arrays.copyOfRange(arrayToSplit,i*chunkSize, i*chunkSize+chunkSize);
        }

        if(rest>0) {
            newArray[newArraySize-1] = Arrays.copyOfRange(arrayToSplit, (newArraySize-1)*chunkSize, (newArraySize-1)*chunkSize +rest);
        }

        return newArray;

    }
}
