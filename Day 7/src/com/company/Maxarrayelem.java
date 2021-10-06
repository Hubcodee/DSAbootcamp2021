package com.company;


public class Maxarrayelem {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 9, 7};
        int start = 0;
        int end = arr.length - 1;
        System.out.println(max(arr, start, end));
    }

    static int max(int[] arr, int start, int end) {
        int max = start;

        for (int j = start; j < end; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        return max;
    }
}
