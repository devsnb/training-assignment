package com.shristi.bank;

public class Main {
    public static void main(String[] args) {
        Bank axis = new Bank(5000);

        axis.deposit(500);

        axis.withdraw(700);

        System.out.println(axis.getBalance());
    }
}
