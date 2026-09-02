package com.joysistvi.stage1.day4.day11;

import java.util.Scanner;

public class Activity9_Torres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = scanner.nextInt();

        scanner.nextLine();

        String[] studentNames = new String[students];
        String[] subjectNames = new String[subjects];
        double[][] grades = new double[students][subjects];
        double[] average = new double[students];

        // Enter subject names
        System.out.println("\nEnter subject names:");

        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectNames[i] = scanner.nextLine();
        }

        // Enter student names and grades
        for (int i = 0; i < students; i++) {

            System.out.print("\nEnter student's name: ");
            studentNames[i] = scanner.nextLine();

            double sum = 0;

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter grade in " + subjectNames[j] + ": ");
                grades[i][j] = scanner.nextDouble();

                sum += grades[i][j];
            }

            average[i] = sum / subjects;

            scanner.nextLine();
        }

        // Display Grades Report
        System.out.println("\n================ GRADES REPORT ================");

        System.out.printf("%-20s", "Student Name");

        for (int i = 0; i < subjects; i++) {
            System.out.printf("%-15s", subjectNames[i]);
        }

        System.out.printf("%-10s%n", "Average");

        for (int i = 0; i < students; i++) {

            System.out.printf("%-20s", studentNames[i]);

            for (int j = 0; j < subjects; j++) {
                System.out.printf("%-15.2f", grades[i][j]);
            }

            System.out.printf("%-10.2f%n", average[i]);
        }

        System.out.println("================================================");

        scanner.close();
    }
}