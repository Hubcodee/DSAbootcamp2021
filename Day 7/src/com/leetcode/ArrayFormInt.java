//The array-form of an integer num is an array representing its digits in left to right order.
//For example, for num = 1321, the array form is [1,3,2,1].
//Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

//https://leetcode.com/problems/add-to-array-form-of-integer/

package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayFormInt {
    public static void main(String[] args) {
        int[] num = {2,7,4};
        int k=181;
        ArrayList<Integer> list = new ArrayList<>(num.length);
        int size=num.length-1;
        while (k>0 || size>= 0){
//            size<0 go to else part for remaning one
            if(size>=0) {
//              181+4 = 185
                k =k + num[size];
//                list.add(185%10=5)
                list.add(k % 10);
            }
            else list.add(k%10);
            size--;
//            185/10 = 18
            k=k/10;
        }
        Collections.reverse(list);
        for (int j=0;j<=num.length;j++){
            System.out.println(list.get(j));
        }
    }
}
