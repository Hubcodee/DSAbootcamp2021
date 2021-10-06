/*
Given an array nums of integers, return how many of them contain an even number of digits.
 */
package com.leetcode;

public class Evenfromarray {
    public static void main(String[] args) {
        int[] nums= {12,345,2,6,7896};
        int res=0;
        for(int i : nums){
            if((int)(Math.log10(i)+1)%2==0){
                res+=1;
            }
//            if(String.valueOf(i).length()%2==0){
//                res+=1;
//            }
        }
        System.out.println(res);
    }
}
