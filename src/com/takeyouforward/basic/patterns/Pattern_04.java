package com.takeyouforward.basic.patterns;

import java.util.Scanner;

public class Pattern_04 {
    /**
         1
         22
         333
         4444
         55555
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pattern level: ");
        int n = sc.nextInt();
        System.out.println("\n----------PATTERN-----------");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
    }
}
