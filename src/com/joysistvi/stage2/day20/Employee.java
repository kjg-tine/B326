package com.joysistvi.stage2.day20;

public class Employee {

    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double computeSalary() {
        return baseSalary;
    }

    public double computeSalary(double taxRate) {
        double salary = computeSalary();
        return salary - (salary * taxRate);
    }

    public void printPayslip() {
        System.out.println(name + "'s salary: " + computeSalary());
    }

    public String getEmployeeType() {
        return "Employee";
    }
}