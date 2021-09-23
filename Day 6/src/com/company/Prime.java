package com.company;
import java.util.Scanner;

public class Prime {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Enter lower bound of the interval: ");
        a = sc.nextInt(); // Take input
        System.out.print("\nEnter upper bound of the interval: ");
        b = sc.nextInt(); // Take input
        System.out.printf("\nPrime numbers between %d and %d are: ", a, b);

        prime(a,b);
    }
    static void prime(int a,int b){
        int i,j,flag=1;
        for (i = a; i <= b; i++) {
            if (i>1) {
                for (j = 2; j <= i / 2; ++j) {
                    if (i % j == 0) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1)
                    System.out.println(i);
            }
        }
    }
}