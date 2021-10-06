/*
Given the array nums, for each nums[i]
find out how many numbers in the array are smaller than it.
That is, for each nums[i]
you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.
*/
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/submissions/


package com.leetcode;

import java.util.Arrays;

public class Greatertahn {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ans = new int[nums.length];
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int num : nums) {
                if (num < nums[i])
                    cnt += 1;
            }
            ans[i] = cnt;
            cnt = 0;
        }
        System.out.println(Arrays.toString(ans));
    }
}
