package com.takeyouforward.basic.a.maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P07_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Numbers");
        int number = scanner.nextInt();
        System.out.printf("Prime : "+ getDivisors(number));
    }
    private static boolean getDivisors(int num) {
        ArrayList<Integer> divs = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                divs.add(i);
                if(i < Math.sqrt(num))
                    divs.add(num / i);
            }
        }
        return (divs.size() == 2);
    }
}

