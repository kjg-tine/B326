package com.joysistvi.stage2.day23;

public interface Bonusable {

    double computeBonus();

    boolean isEligibleForBonus();

    default void printBonusStatus() {
        if (isEligibleForBonus()) {
            System.out.println("Bonus Status: Eligible");
        } else {
            System.out.println("Bonus Status: Not Eligible");
        }
    }
}
