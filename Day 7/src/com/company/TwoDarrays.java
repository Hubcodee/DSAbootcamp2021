package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDarrays {
    public static void main(String[] args) {
//        int [][] arr= new int[3][];
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 8},
                {5, 3, 6}
        };
//        for (int[] ints : arr) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<arr.length;i++)
//        System.out.println(Arrays.toString(arr[i]));
//
//        for(int[] row: arr){
//            System.out.print(Arrays.toString(row));
//        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
