/* Leet Code Problem
https://leetcode.com/problems/concatenation-of-array/
 */

package com.leetcode;

import java.util.Arrays;

public class ConcatArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] ans = new int[2 * nums.length];
        int index = 0;
        for (int i = 0; i < 2; i++) {
            for (int num : nums) {
                ans[index++] = num;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}


