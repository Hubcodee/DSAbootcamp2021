/*
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */
//https://leetcode.com/problems/number-of-good-pairs/

package com.leetcode;

public class Goodpair {
    public static void main(String[] args) {
        int[] num = {1, 1, 1, 1};
        int cnt = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length; j++) {
                if (num[i] == num[j] && i < j) {
                    cnt += 1;
                }
            }
        }

        System.out.println(cnt);
    }
}
