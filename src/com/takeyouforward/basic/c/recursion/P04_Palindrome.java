package com.takeyouforward.basic.c.recursion;

import java.util.Arrays;

public class P04_Palindrome {
    public static void main(String[] args) {
        String s = "Teet";
        System.out.println(palindrome(s.toCharArray()));
    }

    private static boolean palindrome(char[] arr) {
        int left =0;
        int right = arr.length-1;
        while(left < right) {
            if(arr[left++] != arr[right--]){
                return false;
            }
        }
        return true;
    }
}
