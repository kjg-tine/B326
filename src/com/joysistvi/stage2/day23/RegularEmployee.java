package com.joysistvi.stage2.day23;

public class RegularEmployee extends Employee
        implements Bonusable, Auditable, Transferable {

    private static final double ATTENDANCE_BONUS = 1000;
    private static final double TAX_RATE = 0.10;
    private static final double TRANSFER_FEE = 25.00;

    public RegularEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double computeSalary() {
        return baseSalary + ATTENDANCE_BONUS;
    }

    @Override
    public String getEmployeeType() {
        return "Regular Employee";
    }

    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_RATE;
    }

    @Override
    public double computeBonus() {
        return baseSalary * 0.05;
    }

    @Override
    public boolean isEligibleForBonus() {
        return true;
    }

    @Override
    public String generateEmployeeId() {
        return "REG-" + name.toUpperCase();
    }

    @Override
    public void logSalaryComputation(String employeeId) {
        System.out.println("Audit log: " + employeeId
                + " salary computed.");
    }

    @Override
    public void transferToBank(String bankName) {
        System.out.println("Salary transferred to " + bankName + ".");
    }

    @Override
    public double getTransferFee() {
        return TRANSFER_FEE;
    }
}