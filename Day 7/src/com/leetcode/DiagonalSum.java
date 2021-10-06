//https://leetcode.com/problems/matrix-diagonal-sum/submissions/
package com.leetcode;

public class DiagonalSum {
    public static void main(String[] args) {
        int [][] mat= {
            {1,2,3}, {4,5,6},{7,8,9}
        };
        int sum=0,j=0;
//        for(int i=0,j=0,k=mat[0].length-1;i<mat.length;i++,j++,k--){
//            if(j==k){
//                sum+=mat[i][j];
//            }
//            else{
//                sum+=mat[i][j]+mat[i][k];
//            }
//        }
//        Primary Diagonal
        for(int i=0;i<mat[0].length;i++){
            sum+=mat[i][i];
        }
//        Secondary Diagonal excluding primary
        for(int k=mat[0].length-1;k>=0;k--){
            if(j!=k)
                sum+=mat[j][k];
            j++;
        }
        System.out.println(sum);
    }
}
