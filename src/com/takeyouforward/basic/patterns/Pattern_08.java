package com.takeyouforward.basic.patterns;

import java.util.Scanner;

public class Pattern_08 {
    /**
         *********
          *******
           *****
            ***
             *
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pattern level: ");
        int n = sc.nextInt();
        System.out.println("\n----------PATTERN-----------");
        for(int i = n; i > 0; i--){
            for(int j = 0; j < n-i; j++){
                System.out.print(" ");
            }
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            for(int j = i; j > 1; j--){
                System.out.print("*");
            }
            for(int j = 0; j < n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
    }
}
