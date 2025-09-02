package com.takeyouforward.basic;

import java.util.Scanner;

public class P01_InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input(user gives value):");
        int num = sc.nextInt();
        System.out.println("Output:"+num);
    }
}
