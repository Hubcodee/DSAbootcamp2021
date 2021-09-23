package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	    Scanner scanner = new Scanner(System.in);
//	    int num1 = scanner.nextInt();
//	    int num2 = scanner.nextInt();
//	    int ans = sum(num1,num2);
        String ans = sum("Bro","Code");
        System.out.println(ans);

    }
    static int sum(int num1,int num2){
        return num1+num2;
    }
    static String sum(String num1,String num2){
        return num1+num2;
    }
}
