package com.shristi.abastraction;

abstract public class Bank {
    double balance;

    public Bank() {
        super();
    }

    public Bank(double balance) {
        this.balance = balance;
    }

    abstract void withdraw(double amount);

    abstract void deposit(double amount);

    double getBalance() {
        System.out.println("Balance Avilable: " + balance);
        return balance;
    }

}