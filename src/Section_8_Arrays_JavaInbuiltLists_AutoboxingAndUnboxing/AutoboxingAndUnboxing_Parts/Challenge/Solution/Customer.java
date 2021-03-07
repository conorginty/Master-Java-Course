package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.AutoboxingAndUnboxing_Parts.Challenge.Solution;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        // Initialise the transactions
        transactions = new ArrayList<Double>();
        // Upon creation of Customer, add their 1st transaction
        addTransaction(initialTransaction);
    }

    public void addTransaction(double amount) {
        // We're displaying autoboxing here (converting from primitive parameter "amount" -> Double in our transactions ArrayList
        transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
