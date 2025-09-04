package com.takeyouforward.basic.maths;

import java.util.Scanner;

public class P01_CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Digit count: "+ countDigits(Math.abs(n)));
    }

    private static int countDigits(int n) {
        if(n < 10){
            return 1;
        }
        return 1 + countDigits(n/10);
    }
}