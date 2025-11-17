package com.takeyouforward.basic.maths;

import java.util.Scanner;

public class P02_ReverseNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Reverse of the number: " + reverseNumber(num));
        System.out.println("Reverse of the number: " + reverseNumberIterative(num));
    }

    public static int reverseNumberIterative(int n) {
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    public static int reverseNumber(int n) {
        return reverseNumberHelper(n, 0);
    }

    private static int reverseNumberHelper(int n, int number) {
        if (n == 0) return number;
        int tempRes = (number * 10) + (n % 10);
        return reverseNumberHelper(n / 10, tempRes);
    }

}
