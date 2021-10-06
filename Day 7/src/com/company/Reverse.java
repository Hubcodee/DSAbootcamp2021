package com.company;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 6, 3, 8, 6};
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
//        reverse(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
//    static void reverse(int [] arr,int start,int end){
//        while(start<end){
//            swap(arr,start,end);
//            start++;
//            end--;
//        }
//    }
}
