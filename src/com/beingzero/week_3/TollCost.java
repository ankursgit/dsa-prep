package com.beingzero.week_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * 
 * 	2
	6 4
	2 9 1 7
	3 0 1 1 
	6 2 1 8
	1 5 2 2
	7 3 2 9
	5 4 1 1
	6
	1 6 5 2 3 4
	3 3
	1 0 0
	2 1 1
	3 2 2
	2
	2 3
 */
public class TollCost {
	final static int MAX_VAL = 100000;

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while (T-- != 0) {
			String[] in = br.readLine().split(" ");
			int R = Integer.parseInt(in[0]);
			int C = Integer.parseInt(in[1]);
			int[][] arr = new int[R][C];
			int[][] dpa = new int[R][C];
			
			for (int i = 0; i < R; i++) {
				in = br.readLine().split(" ");
				for (int j = 0; j < C; j++) {
					arr[i][j] = Integer.parseInt(in[j]);
				}
			}
			for (int i = 0; i < R; i++) {
				dpa[i][C-1] = arr[i][C-1];
			}
			for (int i = 0; i < C; i++) {
				dpa[R-1][i] = dpa[R-1][i];
			}
			
			System.out.println("---------------------------");
			int ua = 0;
			int ma = 0;
			int da = 0;
			int curr = 0;
			for (int j = C - 2; j >= 0; j--) {
				for (int i = 0; i < R; i++) {
					curr = arr[i][j];
					ua = (i == 0) ? MAX_VAL : dpa[i - 1][j + 1];
					ma = dpa[i][j + 1];
					da = (i == (R - 1)) ? MAX_VAL : dpa[i + 1][j + 1];
					
					dpa[i][j] = Math.min(curr+ua, Math.min(curr+ma, curr+da));
					//System.out.println( curr + "--"+ ua + "--" + ma + "--" + da + "==>" + dpa[i][j]);
				}

			}
//			for (int i = 0; i < R; i++) {
//				for (int j = 0; j < C; j++) {
//					
//					System.out.print(dpa[i][j]+" ");
//				}
//				System.out.println();
//			}
			
			int Q = Integer.parseInt(br.readLine());
			
	        in = br.readLine().split(" ");
	        int q = 0;
	        for(int j = 0; j < Q; j++)
	        {
	            q = Integer.parseInt(in[j]);
	            System.out.print(dpa[q-1][0] + " ");
	        }
		}
		System.out.println();
	}
}
