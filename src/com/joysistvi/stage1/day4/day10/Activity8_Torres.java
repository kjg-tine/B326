package com.joysistvi.stage1.day4.day10;

import java.util.Scanner;

public class Activity8_Torres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declare an array of 5 integers
        int[] numbers = new int[5];

        int sum = 0;

        // Ask the user to enter 5 numbers
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Display all numbers entered
        System.out.println("\nYou entered:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
            sum += numbers[i];
        }

        // Compute average
        double average = (double) sum / numbers.length;

        // Find highest and lowest
        int highest = numbers[0];
        int lowest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }

            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        // Display results
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);

        scanner.close();
    }
}