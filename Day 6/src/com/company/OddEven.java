package com.company;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean ans = oddEven(num);
        if(ans){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        
    }
    static boolean oddEven(int num){
        return (num%2==0);
    }
}
