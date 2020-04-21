package com.beingzero.week_3;

import java.util.Arrays;

public class MagicSq {

	void fillMagicSq(int ms[][]) {
		for (int[] row : ms)
			Arrays.fill(row, -1);

		int n = ms.length;

		int r = 0;
		int c = n / 2;
		ms[r][c] = 1;
		int pr = 0, pc = 0;
		for (int i = 2; i <= n * n; i++) {
			pr = r;
			pc = c;
			r = (r - 1 + n) % n;
			c = (c + 1) % n;
			if (ms[r][c] != -1) {
				r = (pr + 1) % n;
				c = pc;
			}
			ms[r][c] = i;
		}
	}

	void printMS(int ms[][]) {
		for (int i = 0; i < ms.length; i++) {
			for (int i2 = 0; i2 < ms.length; i2++)
				System.out.printf("%d ", ms[i][i2]);
			System.out.println();
		}
	}
}
