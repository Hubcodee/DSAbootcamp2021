/*
Given two arrays of integers nums and index.
Your task is to create target array under the following rules:
Initially target array is empty.
From left to right read nums[i] and index[i],
insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.
 */
//https://leetcode.com/problems/create-target-array-in-the-given-order/

package com.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Targetarr {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        ArrayList <Integer> result = new ArrayList<>();
        for (int i=0;i< nums.length;i++){
            result.add(index[i], nums[i]);
        }
        int[] result1 = new int[nums.length];
        for (int i=0;i< nums.length;i++){
            result1[i] = result.get(i);
        }
        System.out.println(Arrays.toString(result1));
    }
}
