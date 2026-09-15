package com.joysistvi.stage2.day23;

public interface Transferable {

    void transferToBank(String bankName);

    double getTransferFee();

    default void printTransferInfo() {
        System.out.println("Transfer Fee: " + getTransferFee());
    }
}
