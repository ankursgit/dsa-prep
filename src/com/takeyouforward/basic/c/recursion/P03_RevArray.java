package com.takeyouforward.basic.c.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class P03_RevArray {
    public static void main(String[] args) {
        int[] number = {8793,7318,2766,317,2548,7983,3977,9577,7383,2735,3257,5649,9299,4965,5273,706,3148,9522,3678,8379,9813,6311,4809,5066,5068,6123,6074,7482,6837,4889,1559};
        System.out.println(Arrays.toString(arrayReverse(number)));
    }

    private static int[] arrayReverse(int[] arr) {
        return arrayReverseHelper(arr, 0, arr.length-1);
    }

    private static int[] arrayReverseHelper(int[] arr, int left, int right) {
        if(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            arrayReverseHelper(arr, left+1, right-1);
        }
        return arr;
    }
}
