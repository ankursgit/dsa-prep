package com.takeyouforward.basic.a.maths;

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
        int reversed = getReversed(n, 0);
        return original == reversed;
    }

    private static int getReversed(int number, int res) {
        if(number == 0) return number;
        int tempRes = (res * 10) + (number % 10);
        return getReversed(number/10, tempRes);
    }


}
