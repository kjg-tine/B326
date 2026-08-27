package com.joysistvi.stage1.day4.day8;

import java.util.Scanner;

public class Activity6_Torres {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        String email = "winter@gmail.com";
        String password = "winter123";

        boolean isLoggedIn = false;

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("\nEnter Email: ");
            String logEmail = sc.nextLine();

            System.out.print("Enter Password: ");
            String logPass = sc.nextLine();

            if (!logEmail.equals(email) && !logPass.equals(password)) {
                System.out.println("\nInvalid Email and Password!");
            } else if (!logEmail.equals(email)) {
                System.out.println("\nInvalid Email!");
            } else if (!logPass.equals(password)) {
                System.out.println("\nInvalid Password!");
            } else {
                System.out.println("\nLogin Successful!");
                isLoggedIn = true;
                break;
            }

            if (attempt < 3) {
                System.out.println("\nAttempts remaining: " + (3-attempt));
            } else {
                System.out.println("\nMaximum attempts reached! Try again in a few minutes.");
            }
        }
        sc.close();
    }
}
