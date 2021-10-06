/*
https://leetcode.com/problems/richest-customer-wealth/
*/
package com.leetcode;

public class Wealth {
    public static void main(String[] args) {
        int[][] nums = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}

        };
        int sum = 0;
        int max = 0;
        for (int[] num : nums) {
            for (int j : num) {
                sum = sum + j;
            }
            max = Math.max(sum, max);
////            System.out.println(sum);
//            if(sum>max){
//                max=sum;
//            }
            sum = 0;
        }
//        return max;
        System.out.println(max);
    }
}
