package com.takeyouforward.basic.a.maths;

import java.util.Scanner;

public class P05_Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Numbers");
        int number = scanner.nextInt();
        boolean isAs = isArmstrongNumber(number);
        System.out.printf("Is ArmStrong : %b", isAs);
    }

    private static boolean isArmstrongNumber(int num) {
        int digits = String.valueOf(num).length();
        if(num < 10) return true;
        return num == isArmstrongNumberH(num, digits);
    }

    private static double isArmstrongNumberH(int num, int power) {
        if(num < 10) return Math.pow(num, power);
        double res = Math.pow(num%10, power);
        return res + isArmstrongNumberH(num / 10, power);
    }
}
