package com.takeyouforward.basic.patterns;

import java.util.Scanner;

public class Pattern_01 {
    /**
         *****
         *****
         *****
         *****
         *****
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pattern level: ");
        int n = sc.nextInt();
        System.out.println("\n----------PATTERN-----------");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
    }
}
