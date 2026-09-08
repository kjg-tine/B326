package com.joysistvi.stage2.day17;

import java.util.Scanner;

public class Activity12_Torres {

    static void checkOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is EVEN.");
        } else {
            System.out.println(number + " is ODD.");
        }
    }

    static void printName50Times(String name) {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ". " + name);
        }
    }

    static int getSquare(int number) {
        return number * number;
    }

    static double getPower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    static void printRandomNumber() {
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Random number: " + randomNumber);
    }

    static double getCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    static boolean isVoter(int age) {
        return age >= 18;
    }

    static int getWordLength(String word) {
        return word.length();
    }

    static void printReverse(String word) {
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        System.out.println("Reverse: " + reversed);
    }

    static void printFullNameAndAge(String firstName, String lastName, int age) {
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== ACTIVITY 12: JAVA METHODS =====");

        System.out.print("\nEnter a number to check Odd or Even: ");
        int number = input.nextInt();
        checkOddEven(number);

        input.nextLine();
        System.out.print("\nEnter your name: ");
        String name = input.nextLine();

        System.out.println("\nYour name 50 times:");
        printName50Times(name);

        System.out.print("\nEnter a number to get its square: ");
        int squareNumber = input.nextInt();

        System.out.println("Square: " + getSquare(squareNumber));

        System.out.print("\nEnter the base: ");
        double base = input.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = input.nextDouble();

        System.out.println("Power: " + getPower(base, exponent));

        System.out.println("\nRandom Number between 1 and 100:");
        printRandomNumber();

        System.out.print("\nEnter the radius of the circle: ");
        double radius = input.nextDouble();

        System.out.println("Area of the circle: " + getCircleArea(radius));

        System.out.print("\nEnter your age to check if you are a voter: ");
        int age = input.nextInt();

        if (isVoter(age)) {
            System.out.println("You are a voter.");
        } else {
            System.out.println("You are not a voter.");
        }

        input.nextLine();
        System.out.print("\nEnter a word: ");
        String word = input.nextLine();

        System.out.println("Length of the word: " + getWordLength(word));

        System.out.println("Reversed word:");
        printReverse(word);

        System.out.print("\nEnter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter your age: ");
        int fullAge = input.nextInt();

        System.out.println();
        printFullNameAndAge(firstName, lastName, fullAge);

        input.close();
    }
}