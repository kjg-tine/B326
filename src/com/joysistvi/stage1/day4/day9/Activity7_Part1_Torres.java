package com.joysistvi.stage1.day4.day9;

import java.util.Scanner;

public class Activity7_Part1_Torres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter multiplication table: ");
        int number = sc.nextInt();

        System.out.println("\nMultiplication Table of " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        sc.close();
    }
}