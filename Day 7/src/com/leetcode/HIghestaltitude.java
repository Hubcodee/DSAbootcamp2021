/*
There is a biker going on a road trip.
The road trip consists of n + 1 points at different altitudes.
The biker starts his trip on point 0 with altitude equal 0.
You are given an integer array gain of length n where gain[i] is the net gain in altitude between points
i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
 */
//https://leetcode.com/problems/find-the-highest-altitude/submissions/

package com.leetcode;

import java.util.Arrays;

public class HIghestaltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
//        int[] result = new int[gain.length+1];
        int result=0;
        int max=0;
        for(int i = 1;i<=gain.length;i++){
//            result[i] = result[i-1]+gain[i-1];
            result = result+gain[i-1];
            max = Math.max( result , max );
        }
//        System.out.println(Arrays.toString(result));
        System.out.println(max);
    }
}
