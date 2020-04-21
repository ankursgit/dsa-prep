package com.beingzero.week_2;

import java.util.Arrays;
import java.util.Scanner;

public class Tribonacci {

	static Scanner sc = new Scanner(System.in);
	static int mod = (int) 1e9 + 7;
	static long[] dp = new long[1001];

	public static void main(String[] args) {
		Arrays.fill(dp, -1);
		int T = sc.nextInt();
		dp[0] = 0;
		dp[1] = 0;
		dp[2] = 1;
		for (int i = 3; i < 1001; i++) {
			dp[i] = modSum(modSum(dp[i - 1], dp[i - 2]), dp[i - 3]);
		}
		while (T-- > 0) {
			int n = sc.nextInt();
			System.out.println(dp[n]);
		}
	}

	static long modSum(long a, long b) {
		return ((a % mod) + (b % mod)) % mod;
	}
}
