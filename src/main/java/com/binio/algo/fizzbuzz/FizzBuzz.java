package com.binio.algo.fizzbuzz;

import java.util.stream.IntStream;

import com.sun.webkit.dom.RangeImpl;

public class FizzBuzz {

    public static String fb(int number) {
        StringBuffer bfr= new StringBuffer();
        IntStream stream = IntStream.rangeClosed(1, number);
        stream.forEach(o -> {
            bfr.append(o);
            if(o%3==0){
                bfr.append("FIZZ");
        }
            if(o%5==0){
                bfr.append("BUZZ");
            }

        });
        return bfr.toString();
    }
}
