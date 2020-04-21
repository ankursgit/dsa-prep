package com.beingzero.week_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SliddingWindow_MaxSubStringLength {

	static Scanner sc = new Scanner(System.in);
	static Set<Character> set = new HashSet<>();
	static int maxLength = Integer.MIN_VALUE;

	public static void main(String[] args) {
		int T = sc.nextInt();
		sc.nextLine();
		while (T-- != 0) {
			set.clear();
			maxLength = Integer.MIN_VALUE;
			String str = sc.nextLine();
			for (int i = 0; i < str.length(); i++) {
				Character ch = str.charAt(i);
				if (set.contains(ch)) {
					maxLength = Math.max(maxLength, set.size());
					set.clear();
				}
				set.add(ch);
			}
			System.out.println(maxLength);
		}
	}
}
