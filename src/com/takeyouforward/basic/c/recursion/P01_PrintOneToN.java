package com.takeyouforward.basic.c.recursion;

import java.util.Scanner;

public class P01_PrintOneToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Numbers: ");
        int number = scanner.nextInt();
        recursionHelper(number);
    }
    private static void recursionHelper(int n) {
        if(n > 0) {
            System.out.print(n);
            recursionHelper(n-1);
        }
    }
}
