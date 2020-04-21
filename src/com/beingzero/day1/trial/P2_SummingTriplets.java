package com.beingzero.day1.trial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2_SummingTriplets {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] nums = new String[3];
        for(int i = 0; i < N; i++) {
            nums = br.readLine().split(" ");
            System.out.println(Long.parseLong(nums[0]) + Long.parseLong(nums[1]) + Long.parseLong(nums[2]));
        }
    }
}