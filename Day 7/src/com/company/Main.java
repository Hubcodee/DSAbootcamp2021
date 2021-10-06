package com.company;

//import java.util.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
//        int [] roll = new int[5];
//        int [] roll = {1,2,3,4,5};
//        System.out.println(roll[1]);
        String[] str = new String[5];
//        System.out.println(str[1]);
//        for(int i=0;i<roll.length;i++){
//            roll[i] = in.nextInt();
//        }
//        for (int j : roll) {
//            System.out.print(j + " ");
//        }
//        System.out.print(Arrays.toString(roll));
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
//        System.out.println(Arrays.toString(str));
        for (String a : str) {
            System.out.print(a + " ");
        }
    }
}
