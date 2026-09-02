package com.joysistvi.stage1.day4.day11;

public class ResearchActivity_Torres {
    public static void main(String[] args) {

        String country = "Philippines";

        char first = country.charAt(0);
        char last = country.charAt(country.length() - 1);

        int pCount = 0;
        int vowelCount = 0;

        for (int i = 0; i < country.length(); i++) {

            char letter = country.charAt(i);

            if (letter == 'P' || letter == 'p') {
                pCount++;
            }

            if (letter == 'a' || letter == 'e' || letter == 'i' ||
                    letter == 'o' || letter == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Country: " + country);
        System.out.println("First character: " + first);
        System.out.println("Last character: " + last);
        System.out.println("Number of P/p: " + pCount);
        System.out.println("Number of vowels: " + vowelCount);
    }
}
