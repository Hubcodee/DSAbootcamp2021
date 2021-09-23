package com.company;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println(isEligible(age)?"Yes":"No");
    }
    static boolean isEligible(int a){
        return(a>=18);
    }
}
