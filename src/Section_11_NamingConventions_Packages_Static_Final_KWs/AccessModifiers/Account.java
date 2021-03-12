package Section_11_NamingConventions_Packages_Static_Final_KWs.AccessModifiers;

import java.util.ArrayList;

// Part of 149...
public class Account {
    // We'll make all the fields public (BAD practice, but just to show why this is bad)
    public String accountName;
    public int balance = 0;
    public ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    // Methods to support deposits and withdrawals
    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            balance += amount;
            System.out.println(amount + " deposited successfully. Balance now: " + balance);
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withdraw(int amount) {
        int withdrawal = -amount;
        if (withdrawal < 0) {
            transactions.add(withdrawal);
            balance += withdrawal; // Will deduct from balance (as it's negative)
            System.out.println(amount + " withdrawn successfully. Balance now: " + balance);
        } else {
            System.out.println("Cannot withdraw negative sums");
        }
    }

    public void calculateBalance() {
        balance = 0;
        for (int i: transactions) {
            balance += i;
        }
        System.out.println("Calculated balance = " + balance);
    }
}
