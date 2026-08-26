package com.joysistvi.stage1.day4.day7;

import java.util.Scanner;

public class Activity5_Torres {
    public static void main (String[] args) {

        double balance = 5000.00;
        int choice;
        double depositAmount;
        double withdrawAmount;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n=== ATM ===");
            System.out.println("\n1 - Check Balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.printf("\nYour Balance is: %.2f%n",  balance);
                    break;
                case 2:
                    System.out.print("\nEnter deposit amount: ");
                    depositAmount = sc.nextDouble();

                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("\nDeposit Successful!");
                        System.out.printf("Your new balance is: %.2f%n", balance);
                    } else {
                        System.out.println("\nDeposit must be greater than 0. Please try again.");
                    }
                    break;
                case 3:
                    System.out.print("\nEnter withdrawal amount: ");
                    withdrawAmount = sc.nextDouble();

                    if (withdrawAmount > 0) {
                        if (withdrawAmount <= balance) {
                            balance -= withdrawAmount;
                            System.out.println("\nWithdrawal Successful!");
                            System.out.printf("Your new balance is: %.2f%n", balance);
                        } else {
                            System.out.println("\nInsufficient Balance");
                        }
                    } else {
                        System.out.println("\nWithdrawal must be greater than 0. Please try again.");
                    }
                    break;
                case 4:
                    System.out.println("\nThank you for using our Bank.");
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please enter a number from 1 to 4");
                    break;
            }
        } while (choice != 4);


        sc.close();
    }
}
