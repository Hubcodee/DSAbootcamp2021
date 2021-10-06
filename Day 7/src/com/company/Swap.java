package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 3, 7};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
