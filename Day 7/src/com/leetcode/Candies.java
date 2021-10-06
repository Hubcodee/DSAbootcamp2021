//There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has,
//and an integer extraCandies, denoting the number of extra candies that you have.
//Return a boolean array result of length n, where result[i] is true if,
//after giving the ith kid all the extraCandies,
//they will have the greatest number of candies among all the kids, or false otherwise.
//Note that multiple kids can have the greatest number of candies.
//
package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Candies {
    public static void main(String[] args) {
        int[] candies = {4, 2, 1, 1, 2};
        int max = Integer.MIN_VALUE;
        int extraCandies = 1;
        // boolean [] result = new boolean[candies.length];
        ArrayList<Boolean> result = new ArrayList<>();
        for (int j : candies) {
            if (j > max) max = j;
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) result.add(true);
            else result.add(false);
        }

        for (int i = 0; i < candies.length; i++) {
            System.out.println(result.get(i));
        }
    }
}
