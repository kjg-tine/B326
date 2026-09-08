package com.joysistvi.stage1.day4.day11;

import java.util.Scanner;

public class isEmpty_Presentation {
    public static void main (String[] args) {
        /*String name = "";

        System.out.println(name.isEmpty());*/

        /*String name = "Kristine";

        System.out.println(name.isEmpty());*/

        Scanner sc = new Scanner(System.in);

        /*System.out.print("Enter your name: ");
        String name = sc.nextLine();

        if (name.isEmpty()) {
            System.out.println("You did not enter your name.");
        } else {
            System.out.println("Hello, " + name);
        }*/

        String name;
        while (true) {
            System.out.print("Customer Name: ");
            name = sc.nextLine();

            if (name.isEmpty()) {
                System.out.println("\nName is blank. Enter a name.");
                continue;
            }
            break;
        }

        System.out.println("\nName is: " + name);

    }
}
