package com.takeyouforward.basic.patterns;

import java.util.Scanner;

public class Pattern_06 {
    /**
         12345
         1234
         123
         12
         1
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pattern level: ");
        int n = sc.nextInt();
        System.out.println("\n----------PATTERN-----------");
        for(int i = n; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
    }
}
