package com.beingzero.week_2;

import java.util.Scanner;

public class SliddingWindow_SubSeq_GivenSum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		
		while (T-- != 0) {
			int n = sc.nextInt();
			sc.nextLine();
			
			String[] in = sc.nextLine().split(" ");
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = (Integer.parseInt(in[i]));
				
			}
			int Q = sc.nextInt();
			sc.nextLine();
			in = sc.nextLine().split(" ");
			int[] qarr = new int[Q];
			for (int i = 0; i < Q; i++) {
				qarr[i] = (Integer.parseInt(in[i]));
				
			}

			for (int i = 0; i < Q; i++) {
				int sum = qarr[i];
				System.out.println();
				System.out.print("-"+sum + " : ");
				
				int count = 0;
				int lSum = 0;
				int start = 0, end = 0;

				while (end < n) {
					lSum = lSum + arr[end];
					if (lSum == sum) {
						System.out.print("("+start+"--"+end + ")");
						lSum = 0;
						count++;
						start++;
					}
					while (lSum > sum) {
						lSum = lSum - arr[start];
						if (lSum == sum) {
							System.out.print("-("+start+"--"+end + ")");
							lSum = 0;
							count++;
						}
						start++;
					}
					end++;
				}
				System.out.print(count + " ");
			}
			System.out.println();
		}

	}
}
