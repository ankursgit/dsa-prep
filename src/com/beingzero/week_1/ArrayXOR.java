package com.beingzero.week_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayXOR {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int len = Integer.parseInt(br.readLine());
				String[] nums = br.readLine().split(" ");
				getXOR(nums);
		}
	}

	public static void getXOR(String[] nums) {
		int sum = Integer.parseInt(nums[0]);
		for (int i = 1; i < nums.length; i++) {
			sum ^= Integer.parseInt(nums[i]);
		}
		System.out.println(sum);
	}
}
