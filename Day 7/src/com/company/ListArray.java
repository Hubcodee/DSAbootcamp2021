package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ListArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
//        Add elem to list
//        list.add(5);
//        System.out.print(list);
////        Check if exists
//        System.out.println(list.contains(100));
////        update elem
//        list.set(0,10);
//        System.out.print(list);
////      Removing element
//        list.remove(0);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

    }

}
