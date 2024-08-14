package org.academiadecodigo.bootcamp.prototype;

public class CheckingAccount implements Prototype {

    private int id;
    private int balance = 100;

    public void openCheckingAccount(int id){
        this.id = id;
        System.out.println("You've opened a new Checking Account.\n"
                + "Your account id is " + id + "\n"
                + "Your starting balance is " + balance + "\n"
                + "--------------------------------");
    }

    public void withdraw(int amount){
        balance -= amount;
        System.out.println("You've made a withdrawal of " + amount
                + " from your account number " + id);
        System.out.println("Your current balance is " + balance + "\n"
                + "--------------------------------");
    }

    @Override
    public Prototype clone() {
        return new CheckingAccount();
    }
}
