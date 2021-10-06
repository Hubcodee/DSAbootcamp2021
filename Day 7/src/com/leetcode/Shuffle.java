//https://leetcode.com/problems/shuffle-the-array/
package com.leetcode;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int divide = 2;
        int[] arr = {1, 1, 2, 2};
//        Input: nums = [2,5,1,3,4,7], n = 3
//        Output: [2,3,5,4,1,7]
//        Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7
//        then the answer is [2,3,5,4,1,7].
        int[] ans = new int[arr.length];
        int mid = divide;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                ans[i] = arr[start++];
            } else {
                ans[i] = arr[mid++];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
