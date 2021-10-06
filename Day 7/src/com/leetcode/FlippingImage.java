/*
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
For example, inverting [0,1,1] results in [1,0,0].
 */
//https://leetcode.com/problems/flipping-an-image/

package com.leetcode;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] flipAndInvertImage = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        int[][] res = new int[flipAndInvertImage.length][flipAndInvertImage[0].length];
        for(int i = 0;i< flipAndInvertImage.length;i++){
            for (int j=0 ;j<flipAndInvertImage[i].length;j++){
                res[i][j] = flipAndInvertImage[i][flipAndInvertImage.length-j-1];
                if(res[i][j]==0){
                    res[i][j]=1;
                }
                else{
                    res[i][j]=0;
                }
            }

        }
        for(int []i : res)
        System.out.println(Arrays.toString(i));
    }

}
