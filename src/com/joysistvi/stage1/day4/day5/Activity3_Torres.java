package com.joysistvi.stage1.day4.day5;

import java.util.Scanner;

public class Activity3_Torres {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        //Allowed Persons in the event
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Do you have a Valid ID? (True/False): ");
        boolean hasID = sc.nextBoolean();

        boolean allowed = age >= 18 && hasID;

        String result = allowed ? "Yes" : "No";
        System.out.println("Allowed to enter the Event? : " + result);

        //Weekend or Not
        System.out.print("\nIs it Weekend? (True/False): ");
        boolean isWeekend = sc.nextBoolean();

        System.out.print("Is it a Holiday? (True/False): ");
        boolean isHoliday = sc.nextBoolean();

        boolean noClass = isWeekend || isHoliday;
        String result2 = noClass ? "Yes" : "No";

        System.out.println("Are there No Classes Today? " + result2);

        //Score Analyzer

        System.out.print("\nEnter Score: ");
        int score = sc.nextInt();

        String result3 = score >= 75 ? "Passed" : "Failed";

        System.out.println("Result: " + result3);


        //Larger Number

        System.out.print("\nEnter First Number: ");
        int num = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        int larger = num > num2? num : num2;

        System.out.println("Larger Number: " + larger);

        sc.close();


    }
}
