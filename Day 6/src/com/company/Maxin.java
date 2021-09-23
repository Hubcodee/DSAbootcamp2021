package com.company;

public class Maxin{

    public static void main(String[] args) {
        int num1=10,num2=20,num3=22;
        int max =max(num1,num2,num3);
        int min = min(num1,num2,num3);
        System.out.println("max : "+max);
        System.out.println("min : "+min);
    }
    static int max(int num1,int num2,int num3){
        int greater = num1;
        if(num2>greater){
            greater = num2;
        }
        if(num3>greater){
            greater = num3;
        }
        return greater;
    }
    static int min(int num1,int num2,int num3){
        int smallest = num1;
        if(num2<smallest){
            smallest=num2;
        }
        if(num3<smallest){
            smallest=num3;
        }
        return smallest;
    }
}
