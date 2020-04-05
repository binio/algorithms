package com.binio.algo.fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzzExcersise {

    public static String fb(int input) {
        StringBuffer buffer = new StringBuffer();
        for(int i=1; i<=input; i++){
            buffer.append(i);

            if(i%3 == 0) {
                buffer.append("FIZZ");
            }

            if(i%5 == 0) {
                buffer.append("BUZZ");
            }
        }
        return buffer.toString();
    }

    public static String fbV2(int input) {
        StringBuffer buffer = new StringBuffer();
        IntStream stream = IntStream.rangeClosed(1, input);
        stream.forEach(o -> {
            buffer.append(o);

            if(o%3 == 0) {
                buffer.append("FIZZ");
            }

            if(o%5 == 0) {
                buffer.append("BUZZ");
            }
        });

        return buffer.toString();
    }
}
