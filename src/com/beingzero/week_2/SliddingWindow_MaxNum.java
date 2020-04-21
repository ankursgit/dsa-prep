package com.beingzero.week_2;

import java.util.Scanner;

public class SliddingWindow_MaxNum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		sc.nextLine();
		while (T-- != 0) {
			String[] in = sc.nextLine().split(" ");
			int n = Integer.parseInt(in[0]);
			int k = Integer.parseInt(in[1]);

			in = sc.nextLine().split(" ");
			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(in[i]);

			}

			int end = 0, start = 0, max = Integer.MIN_VALUE;
			while (end < n) {
				max = Math.max(max, arr[end]);
				if ((end - start + 1) == k) {
					System.out.print(max + " ");
					if (arr[start] == max) {
						max = Integer.MIN_VALUE;
						for (int i = start + 1; i <= end; i++) {
							max = Math.max(max, arr[i]);
						}
					}
					start++;
				}
				end++;
			}
			System.out.println();
		}

	}
}
