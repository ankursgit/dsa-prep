package com.beingzero.day1.trial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1_FastIO {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		int D = Integer.parseInt(inputs[0]);
		int N = Integer.parseInt(inputs[1]);

		int count = 0;
		int temp = 0;
		for (int i = 0; i < N; i++) {
			temp = Integer.parseInt(br.readLine());
			if (((temp / 10) % 10) == D)
				count++;
		}
		System.out.print(count);
	}
}