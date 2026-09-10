package com.joysistvi.stage2.day19;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("***************************************");
        System.out.println("*     User Account Registration       *");
        System.out.println("***************************************");

        System.out.print("\nEnter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        String email;
        while (true) {
            System.out.print("Enter Email: ");
            email = sc.nextLine();

            if (email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
                break;
            }

            System.out.println("Invalid email format. Please try again.");
        }

        String password;
        while (true) {
            System.out.print("Enter Password: ");
            password = sc.nextLine();

            if (password.length() >= 8
                    && password.matches(".*[A-Za-z].*")
                    && password.matches(".*[0-9].*")
                    && !password.contains(" ")) {
                break;
            }

            System.out.println("Invalid password.");
            System.out.println("Password must be at least 8 characters, contain a letter and a number, and have no spaces.");
        }

        UserAccount user = new UserAccount(
                firstName,
                middleName,
                lastName,
                address,
                email,
                password
        );

        System.out.println("\n--- User Account Created ---");
        System.out.println("Full Name: " + user.getFirstName() + " "
                + user.getMiddleName() + " "
                + user.getLastName());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Email: " + user.getEmail());

        sc.close();
    }
}
