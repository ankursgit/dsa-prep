package com.takeyouforward.basic.c.recursion;

import java.util.Arrays;

public class P06__Fabo {
    public static void main(String[] args) {
        int[] dp = new int [21];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;

        int n = 5;
        System.out.println(getFib(n, dp));
    }

    private static int getFib(int n, int[] dp) {
        if(n <= 3)
            return dp[n];

        if(dp[n] != -1)
            return dp[n];

        int result = getFib(n - 1, dp) + getFib(n - 2, dp);
        dp[n] = result;
        return result;
    }
}
