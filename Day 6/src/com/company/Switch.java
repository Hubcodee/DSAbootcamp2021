package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int week = scan.nextInt();
        switch (week) {
            case 1, 2, 3, 4, 5 -> System.out.println("Week Day");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Wrong Entry");
        }
    }
}
