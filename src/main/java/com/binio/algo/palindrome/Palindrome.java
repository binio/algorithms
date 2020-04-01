package com.binio.algo.palindrome;

public class Palindrome {

    public static boolean checkPalindrome(String input) {
        char[] inputArr = input.toCharArray();
        char[] revertArr = new char[inputArr.length];

        for(int i=0; i < inputArr.length; i++) {
            revertArr[i] = inputArr[inputArr.length -1 -i];
        }
        return String.valueOf(revertArr).equals(input);
    }

    public static boolean checkPalindromeV2(String input) {
        char[] inputArr = input.toCharArray();
        for(int i=0; i < inputArr.length / 2; i++ ) {
            if(inputArr[i] != inputArr[inputArr.length - i - 1]){
                return false;
            }
        }
        return true;
    }
}
