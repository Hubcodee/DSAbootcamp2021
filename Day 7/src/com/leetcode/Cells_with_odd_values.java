//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
package com.leetcode;

import java.util.Arrays;

public class Cells_with_odd_values {
    public static void main(String[] args) {
        int m=2;
        int n=2;
        int count=0;
        int [][]indices = {{1,1},{0,0}};
        int [][] result = new int[m][n];
        for (int[] index : indices) {
            int col = index[1];
            int row = index[0];
            for (int j=0;j<n;j++) {
                result[row][j]++;
            }
            for(int k=0;k<m;k++){
                result[k][col]++;
            }
        }
//        for(int []i:result) {
//            System.out.println(Arrays.toString(i));
//        }
        for (int []i : result) {
            for(int j : i){
                if (j % 2 != 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
