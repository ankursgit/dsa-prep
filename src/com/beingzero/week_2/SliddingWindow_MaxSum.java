package com.beingzero.week_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
 * 	Given an array A of size N; we need to find the maximum average value among all subarrays of K size in the given array A.

	Input Format
	
		First line of input contains T - number of test cases. Its followed by 2*T lines, First line of each testcase contains N and K.
		second line of each testcase contains N elements of the Array A
	
	Constraints
	
		1 <= T <= 100
		1 <= N <= 105
		0 <= A[i] <= 105
		1 <= K <= N
	
	Output Format

		For each test case print a single number on a separate line of output, each representing the maximum subarray average among all subarrays of size K. 
		Print your answer correct upto 3 decimal places.
 */

public class SliddingWindow_MaxSum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			String[] in = br.readLine().split(" ");
			int N = Integer.parseInt(in[0]);
			int K = Integer.parseInt(in[1]);

			long[] arr = new long[N];
			in = br.readLine().split(" ");
			for (int i = 0; i < N; i++) {
				arr[i] = Long.parseLong(in[i]);
			}

			int start = 0, end = 0;
			double maxSum = 0, localSum = 0;
			while (end < N) {
				localSum += arr[end];
				if ((end - start + 1) == K) {
					maxSum = Math.max(localSum, maxSum);
					localSum -= arr[start];
					start++;
				}
				end++;
			}
			System.out.println(String.format("%.3f", (maxSum) / K));
		}
	}
}
