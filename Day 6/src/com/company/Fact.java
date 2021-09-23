package com.company;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num>=0) fact(num);
    }
    static void fact(int num){
        int fact=1;

            if (num == 0 || num == 1) {
//                System.out.println(fact);
            } else {
                for(int i=1;i<=num;i++) fact = fact*i;
            }

        System.out.println(fact);
    }
}
