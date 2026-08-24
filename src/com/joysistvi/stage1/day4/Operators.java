package com.joysistvi.stage1.day4;

public class Operators {
    public static void main (String[] args) {

        int num = 10;
        String numType = (num > 0) ? "Positive" : "Negative";
        System.out.println(numType + " Number");

        int num1 = 100;
        String isEven = num1 % 2 == 0 ? "Even" : "Odd";
        System.out.println(isEven);
    }
}
