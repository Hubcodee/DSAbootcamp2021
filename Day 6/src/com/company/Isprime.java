package com.company;

import java.util.Scanner;

public class Isprime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean flag = isprime(num);
        System.out.println(flag);
    }
    static boolean isprime(int num){
        if (num <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > num;
    }


}
