package com.binio.algo.powoften;

public class Power {

    public  static boolean ifPow(int input) {
        while (input > 9 && input % 10 == 0)
            input /= 10;
        return input == 1;
    }
}
