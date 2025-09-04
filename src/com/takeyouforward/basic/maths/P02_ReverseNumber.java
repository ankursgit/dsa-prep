package com.takeyouforward.basic.maths;

import java.util.Scanner;

public class P02_ReverseNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Reverse of the number: " + reverseNumber(num));
    }

    public static int reverseNumber(int n) {
        int digits = countDigits(n);
        return reverseNumber(n, digits);

    }

    private static int countDigits(int n) {
        if (n < 10) return 1;
        return 1 + countDigits(n / 10);
    }

    private static int reverseNumber(int n, int digits) {
        if (n < 10) return n;
        return (int) ((n % 10 * Math.pow(10, digits - 1)) + (reverseNumber(n / 10, digits - 1))) ;
    }


}
