package com.takeyouforward.basic.maths;

import java.util.Scanner;

public class P03_PalindromeNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Number is Palindrome " + isPalindrome(num));
    }

    private static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }

    private static boolean isPalindrome(int n, int digits) {
        if (n < 10) return true;
        int leftPow = (int) Math.pow(10, digits);
        int leftNum = n / leftPow;
        int rightNum = n % 10;
        System.out.printf("Comparing '%d' with '%d' ", leftNum, rightNum);
        System.out.println();
        if ( leftNum == rightNum) {
            n = n % leftPow;
            n = n / 10;
            return isPalindrome(n, digits - 2);
        }
        return false;
    }

    private static int countDigits(int n) {
        if (n < 10) return 1;
        return 1 + countDigits(n / 10);
    }
}
