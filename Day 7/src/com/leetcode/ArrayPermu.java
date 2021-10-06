/* LeetCode Submissions:
https://leetcode.com/problems/build-array-from-permutation/submissions/
 */

package com.leetcode;

import java.util.Arrays;

public class ArrayPermu {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
//        int [] ans = new int[nums.length];
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
//            ans[i] = nums[nums[i]];
            if (i == nums.length - 1) System.out.print(nums[nums[i]]);
            else System.out.print(nums[nums[i]] + ",");

        }
        System.out.print("]");
//        System.out.println(Arrays.toString(ans));
    }

}
