package com.beingzero.week_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TriangleSum {
	static int maxSumInTri(List<List<Integer>> mat) {

		int rows = mat.size();
		for (int i = rows - 2; i >= 0; i--) {
			List<Integer> row = mat.get(i);
			for (int j = 0; j < row.size(); j++) {
				int cellVal = row.get(j);
				int ra = cellVal + mat.get(i + 1).get(j + 1);
				int da = cellVal + mat.get(i + 1).get(j);
				row.set(j, Math.max(ra, da));
			}
		}
		return mat.get(0).get(0);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int r = sc.nextInt();
			// int c = sc.nextInt();

			// Create a List of null objects, where each object is List<Integer>
			List<List<Integer>> mat = new ArrayList<>();

			// It is important to init all one dimentional arrays
			for (int i = 0; i < r; i++)
				mat.add(new ArrayList<>());

			for (int i = 0; i < r; i++) {
				for (int j = 0; j <= i; j++) {
					int x = sc.nextInt();
					mat.get(i).add(x); // Add x in the ith List to the end
				}
			}

			System.out.println(maxSumInTri(mat));
		}
	}
}
