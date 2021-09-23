package com.company;

import java.util.Scanner;

public class Pythogorean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int a = scan.nextInt();
        System.out.print("Enter Hypotenuse: ");
        int b = scan.nextInt();
        System.out.print("Enter side 2: ");
        int c = scan.nextInt();
        triplet(a,b,c);
    }
  static void triplet(int a,int b,int c){
        if(b==Math.sqrt(a*a+c*c)){
            System.out.println("triplet");
        }
        else System.out.println("Not a triplet");
    }
}
