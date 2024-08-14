package org.academiadecodigo.bootcamp.prototype;

public class SavingsAccount implements Prototype {

    private int id;
    private int balance = 100;

    public void openSavingsAccount(int id){
        this.id = id;
        System.out.println("You've opened a new Savings Account.\n"
                + "Your account id is " + id + "\n"
                + "Your starting balance is " + balance + "\n"
                + "--------------------------------");
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("You've made a deposit of " + amount
                + " in your account number " + id);
        System.out.println("Your current balance is " + balance + "\n"
                + "--------------------------------");
    }

    @Override
    public Prototype clone() {
        return new SavingsAccount();
    }
}
