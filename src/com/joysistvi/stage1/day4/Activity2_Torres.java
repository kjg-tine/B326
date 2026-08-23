package com.joysistvi.stage1.day4;

public class Activity2_Torres {
    public static void main(String[] args) {
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        // Percentages
        double percentageFood = foodAllowance / income * 100;
        double percentageTransport = transportation / income * 100;
        double percentageRent = rent / income * 100;
        double percentageUtility = utilityBill / income * 100;

        // Remaining balance
        double totalExpenses = foodAllowance + transportation + rent + utilityBill;
        double remainingBalance = income - totalExpenses;

        // Output
        System.out.println("Income: " + income);
        System.out.printf("Food Allowance: %.1f %%\n", percentageFood);
        System.out.printf("Transportation: %.1f %%\n", percentageTransport);
        System.out.printf("Rent: %.1f %%\n", percentageRent);
        System.out.printf("Utility Bill: %.1f %%\n", percentageUtility);
        System.out.println("Remaining Balance: " + remainingBalance);
    }
}