package com.joysistvi.stage2.day20;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = {
                new RegularEmployee("Ana", 15000),
                new SalesEmployee("Ben", 12000, 5000),
                new ContractualEmployee("Cruz", 160, 75),
                new ManagerEmployee("Diana", 20000)
        };

        for (Employee e : employees) {

            System.out.println("Employee Type: " + e.getEmployeeType());

            e.printPayslip();

            System.out.println();
        }


        Employee employee = new RegularEmployee("Ana", 15000);

        System.out.println("Normal Salary: " + employee.computeSalary());

        System.out.println(
                "Salary after 10% tax: " + employee.computeSalary(0.10)
        );
    }
}