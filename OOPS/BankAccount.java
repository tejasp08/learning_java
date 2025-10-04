package OOPS;

public class BankAccount {
    private int acc_number;
    private String acc_holder;
    private int balance;

    //Getters
    public int get_acc_number() {
        return acc_number;
    }

    public String get_acc_holder() {
        return acc_holder;
    }

    public int get_acc_balance() {
        return balance;
    }

    //Setters
    public void set_acc_number(int accNumber) {
        acc_number = accNumber;
    }

    public void set_acc_holder(String accHolder) {
        acc_holder = accHolder;
    }

    public void set_acc_balance(int accBalance) {
        balance = accBalance;
    }

    //withdraw and deposit methods
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.err.println("Amount deposited: " + amount);
        } else {
            System.err.println("Amount should be positive");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.err.println("Amount withdrawed: " + amount);
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance!!!");
        }
        else {
            System.err.println("Amount should be positive");
        }
    }
}
