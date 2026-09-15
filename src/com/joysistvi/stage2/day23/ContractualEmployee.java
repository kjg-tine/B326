package com.joysistvi.stage2.day23;

public class ContractualEmployee extends Employee
        implements Auditable, Transferable {

    private double hoursWorked;
    private double hourlyRate;

    private static final double TAX_RATE = 0.05;
    private static final double TRANSFER_FEE = 15.00;

    public ContractualEmployee(String name, double hoursWorked, double hourlyRate) {
        super(name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double computeSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String getEmployeeType() {
        return "Contractual Employee";
    }

    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_RATE;
    }

    @Override
    public String generateEmployeeId() {
        return "CON-" + name.toUpperCase();
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