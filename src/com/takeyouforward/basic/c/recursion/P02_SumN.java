package com.takeyouforward.basic.c.recursion;

import java.util.Scanner;

public class P02_SumN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Numbers: ");
        int number = scanner.nextInt();
        System.out.println(recursionHelper(number));
    }
    private static int recursionHelper(int n) {
        if(n == 0) return n;
        return n + recursionHelper(n-1);
    }
}
