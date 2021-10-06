package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class listmuldarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        list of type arraylist
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
//            Initialized the inner arraylist
            ls.add(new ArrayList<>());
        }
        //Entering elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ls.get(i).add(in.nextInt());
            }
        }
        //Displaying elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
