package com.srikantvs.java8.interfaces;

interface Bank {
    // Abstract methods
    double getBalance();

    void deposit(double amount);

    void withdraw(double amount);

    // default method to display account type
    default void displayAccountType() {
        System.out.println("Account type : GENERIC");
    }
}

class SavingsAccount implements Bank {

    private double balance;

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type :: SAVINGS");
    }

    SavingsAccount(double balance){
        this.balance = balance;
    }
}

public class DefaultMethodsDemo {

    public static void main(String[] args) {
        Bank accBank = new SavingsAccount(10000);
        accBank.displayAccountType();
        System.out.println("Initial Balance :: "+accBank.getBalance());
        accBank.deposit(1000);
        accBank.withdraw(8000);
        System.out.println("Final Balance :: "+accBank.getBalance());
    }

}
