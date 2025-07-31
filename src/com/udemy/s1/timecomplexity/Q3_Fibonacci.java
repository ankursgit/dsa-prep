package com.udemy.s1.timecomplexity;

import java.util.HashMap;
import java.util.Map;

public class Q3_Fibonacci {
    private static final Map<Integer, Long> dp = new HashMap<>();

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            long result = fibo(i);
            System.out.println("fibo(" + i + ") = " + result);
        }
    }

    public static Long fibo(int n) {
        if (n < 2) return (long) n;

        if (dp.containsKey(n)) return dp.get(n);

        long result = fibo(n - 1) + fibo(n - 2);
        dp.put(n, result);
        return result;

    }
}
