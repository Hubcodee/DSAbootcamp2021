package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Modify {
    public static void main(String[] args) {
        //    Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 4, 6, 3, 5, 8,};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr) {
        arr[2] = 99;
    }
}
