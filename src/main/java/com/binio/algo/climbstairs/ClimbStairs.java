package com.binio.algo.climbstairs;

public class ClimbStairs {

    static int fib(int n)
    {
        int stepWay1 = 1;
        int stepWay2 = 2;
        if (n <= 1)
            return n;
        return fib(n-stepWay1) + fib(n-stepWay2);
    }

    static int countWays(int s)
    {
        return fib(s + 1);
    }
}
