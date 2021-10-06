//A pangram is a sentence where every letter of the English alphabet appears at least once.
// Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

package com.leetcode;
import java.util.Arrays;

public class pangram {
    public static void main(String[] args) {
        String sentence = "sentence contains at least one of every letter of the English alphabet";
//        Size=123 because we will be using this array as frequency array
        int[ ] arr = new int[123];
        char []chars = sentence.toCharArray();
//        Char will be converted to integer -- ASCII value
        for(char c: chars)
            if(arr[c]==0)
                arr[c]++ ;
//            System.out.print((int)c +" ");
        System.out.println(Arrays.toString(arr));
        for(int i=97 ;i<123;i++){
//            as we will have ascii value starting from 97-123 for lowercase alphabets.
//            if any of the index if contains zero return false
            if(arr[i]==0) break  ;
        }
//        If not return true that its pangram
//        System.out.println(true);

//        System.out.println(Arrays.toString(arr));
    }
}
