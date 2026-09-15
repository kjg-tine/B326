package com.joysistvi.stage2.day23;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = {
                new RegularEmployee("Ana", 15000),
                new SalesEmployee("Ben", 12000, 5000),
                new ContractualEmployee("Cruz", 160, 75)
        };

        for (Employee e : employees) {

            e.printPayslip();

            if (e instanceof Bonusable) {

                Bonusable b = (Bonusable) e;

                if (b.isEligibleForBonus()) {
                    System.out.println("Bonus: " + b.computeBonus());
                }

                b.printBonusStatus();
            }

            if (e instanceof Auditable) {

                Auditable a = (Auditable) e;

                a.logSalaryComputation(a.generateEmployeeId());
            }

            if (e instanceof Transferable) {

                Transferable t = (Transferable) e;

                t.transferToBank("BPI");
                t.printTransferInfo();
            }

            System.out.println("--------------------------------");
        }
    }
}