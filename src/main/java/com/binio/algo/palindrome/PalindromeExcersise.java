package com.binio.algo.palindrome;

import java.util.Arrays;

public class PalindromeExcersise {

    //checking half of the string
    public static boolean checkPalindrome(String input) {
        char[] inputArr = input.toCharArray();

        for (int i=0; i<inputArr.length/2; i++) {
            if(inputArr[i] != inputArr[inputArr.length -i -1]) {
                return false;
            }
        }
        return true;
    }

    //revert string and compare with original
    public static boolean checkPalindromeV2(String input) {
        char[] inputArr = input.toCharArray();
        char[] outputArr = new char[inputArr.length];

        for(int i = 0; i<inputArr.length; i++) {
            outputArr[i] = inputArr[inputArr.length - i - 1];
        }

        return Arrays.equals(inputArr,outputArr);
    }

}
