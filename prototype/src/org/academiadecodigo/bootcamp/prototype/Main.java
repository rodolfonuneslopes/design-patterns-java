package org.academiadecodigo.bootcamp.prototype;

public class Main {
    public static void main(String[] args) {

        // Checking Account with the Constructor
        CheckingAccount checkingAccount1 = new CheckingAccount();
        checkingAccount1.openCheckingAccount(1);
        checkingAccount1.withdraw(50);

        // Checking Account with Prototype
        CheckingAccount checkingAccount2 = (CheckingAccount) checkingAccount1.clone();
        checkingAccount2.openCheckingAccount(2);
        checkingAccount2.withdraw(30);

        // Savings Account with the Constructor
        SavingsAccount savingsAccount1 = new SavingsAccount();
        savingsAccount1.openSavingsAccount(1);
        savingsAccount1.deposit(100);

        // Savings Account with Prototype
        SavingsAccount savingsAccount2 = (SavingsAccount) savingsAccount1.clone();
        savingsAccount2.openSavingsAccount(2);
        savingsAccount2.deposit(200);

    }
}