package mybanck.account;

public class Account {
    private String owner;
    private double balance;

    public Account(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount > balance){
            throw new IllegalArgumentException("Insufficient fund...");
        }
        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }

    public String getOwner(){
        return owner;
    }
}
