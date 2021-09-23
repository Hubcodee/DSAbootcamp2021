package com.company;

import java.util.Scanner;

public class Ispallindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int ncpy = number;
        boolean flag = ispallindrome(number,ncpy);
        System.out.println(flag);
    }
    static boolean ispallindrome(int n,int ncpy){
        int rem;
        int num=0;
        while(n!=0){
            rem = n%10;
            num=num*10+rem;
            n/=10;
        }
        return num==ncpy;
    }
}
