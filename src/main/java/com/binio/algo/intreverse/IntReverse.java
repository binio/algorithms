package com.binio.algo.intreverse;

public class IntReverse {

    public static int reverse(int input) {
        int sign = Integer.signum(input);
        char[] inputArr = String.valueOf(input).toCharArray();
        char[] revArr = new char[inputArr.length];

        for(int i=0; i<inputArr.length; i++){
            revArr[i] = inputArr[inputArr.length -1 -i];
        }
        String revString = new String(revArr);
        revString = revString.replaceAll("-","");
        return Integer.parseInt(revString) * sign;
    }

    public static int reverseV2(int input) {     //-123
        int revDigit = 0;
        int actDigit;
        int sign = Integer.signum(input);       //-1
        input = input * sign;                   //123

        while(input > 0 ) {                     //true
            actDigit = input % 10;              //3 REMAINER
            input = input / 10;                 //12 TOTAL
            revDigit = revDigit * 10 + actDigit; //0 *10 +3 =>3 // 3*10 +2 => 32 // 32*10 + 1 => 321
        }
        return revDigit * sign;
    }
}
