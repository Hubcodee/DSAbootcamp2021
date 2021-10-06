/* Leet Code Solution
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
https://leetcode.com/problems/running-sum-of-1d-array/submissions/
 */

package com.leetcode;

import java.util.Arrays;

public class Runsum {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
//        int sum = 0;
        int[] ans = new int[num.length];
        for (int i = 1; i < num.length; i++) {
//DP approach
            num[i] = num[i - 1] + num[i];
        }
        System.out.println(Arrays.toString(num));
    }
}
