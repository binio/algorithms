package com.binio.algo.globalrelay;

import java.io.FileInputStream;
import java.io.InputStream;

public class BufferPerformance {

    /*
     If you read from a file by byte you make a system call each time and this is expensive operation.
     With buffered reads you make a system call once per buffer. This code reads 100K from a file on my PC in 130 ms:
     */
    public static void readFile() throws Exception{
        InputStream is = new FileInputStream("d:/1");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            is.read();
        }
        System.out.println((System.currentTimeMillis() - start));
        //and if I change first line with
        //InputStream is = new BufferedInputStream(new FileInputStream("d:/1"));
    }
}
