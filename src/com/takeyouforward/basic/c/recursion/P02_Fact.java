package com.takeyouforward.basic.c.recursion;

import java.util.Scanner;

public class P02_Fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Numbers: ");
        int number = scanner.nextInt();
        System.out.println(factRecursionHelper(number));
    }
    private static int factRecursionHelper(int n) {
        if(n == 1) return n;
        return n * factRecursionHelper(n-1);
    }
}
