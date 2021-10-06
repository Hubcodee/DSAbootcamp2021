//https://leetcode.com/problems/maximum-population-year/
package com.leetcode;

import java.util.Arrays;

public class MaximumPopulation {
    public static void main(String[] args) {
        int[][] logs = {{1950, 1961}, {1960, 1971}, {1970, 1981}};
//        as constraint is inclusive of start=1950 - end=2050 == 101
        int[] pop = new int[101];
/*
        for(int i=0;i< logs.length;i++){
//        for e.g. starting from birth year upto death year(exclusive)
            for(int j=logs[i][0];j<logs[i][1];j++){
//            incrementing value at position j-1950 in pop[101]
                 pop[j-1950]++;
            }
        }
        int max_year=1950,max_value=0;
        for(int k=0;k<pop.length;k++){
//        get maximum population and so the year from pop[]
//        pop[101] contains 0,1
            if(pop[k]>max_value){
                max_value=pop[k];
                max_year=k+1950;
            }
        }
//        System.out.println(Arrays.toString(pop));
        System.out.println(max_year);
        #0(n^2) solution
 */
//        ###########################################################
//      Optimized solution --> 0(n) solution
        for (int[] log : logs) {
//            starting from given year increment the i^th position of pop[]
            pop[log[0] - 1950]++;
//            starting from death year decrement the i^th position of pop[]
            pop[log[1] - 1950]--;
        }
//        running sum of elements in pop
        for(int j=1;j< pop.length;j++) pop[j]+= pop[j-1];
        int max_year = 1950, max_value = 0;
        for (int k = 0; k < pop.length; k++) {
//            get maximum population and so the year
            if (pop[k] > max_value) {
                max_value = pop[k];
                max_year = k + 1950;
            }
        }
        System.out.println(max_year);
    }
}
