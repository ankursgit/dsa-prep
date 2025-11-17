package com.takeyouforward.basic.maths;

import java.util.Scanner;

public class P04_Hcf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate GCD/HCF of Two Numbers");
        System.out.print("Enter First Numbers: ");
        int numOne = scanner.nextInt();
        System.out.print("Enter First Numbers: ");
        int numTwo = scanner.nextInt();
        System.out.printf("The GCD/HCF of %d and %d is : %d", numOne, numTwo, calculateGcd(Math.abs(numOne), Math.abs(numTwo)));
    }

    public static int calculateGcd(int one, int two) {
        if (two == 0) return one;
        return calculateGcd(two, one % two);
    }
}