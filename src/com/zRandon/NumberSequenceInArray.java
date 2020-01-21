package com.zRandon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberSequenceInArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 6, 12, 13, 16 };
		int x = 3;
		List<List<Integer>> list = new ArrayList<List<Integer>>(x);
		for(int i = 0; i< x; i++) {
			list.add(i, (new ArrayList<Integer>()));
		}
		System.out.println(list.size());

		boolean isAdded = false;
		Boolean[] visited = new Boolean[x];
		Arrays.fill(visited, false);

		for (int i = 0; i < arr.length; i++) {

			int num = arr[i];
			isAdded = false;

			for (int j = 0; j < 3; j++) {
				if (!visited[j]) {
					List<Integer> currList = list.get(j);
					if (currList.isEmpty() || (currList.get(currList.size() - 1) + 1 == num)) {
						currList.add(num);
						isAdded = true;
						break;
					}
					if (currList.get(currList.size() - 1) != num)
						visited[j] = true;
				}

			}
			if (!isAdded) {
				System.out.println("INVALID");
				break;
			}
		}
		System.out.println(list);

	}
}
