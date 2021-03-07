package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.AutoboxingAndUnboxing_Parts.Challenge.MyAttempt;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int age;
    private boolean isMarried;
    private ArrayList<Double> transactions;

    public Customer(String name, int age, boolean isMarried, ArrayList<Double> transactions) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    // Public static method to create a new customer
    // static is important, as it means we don't have to create a new object instance for this customer class
    public static Customer createCustomer(String name, int age, boolean isMarried, ArrayList<Double> transactions) {
        return new Customer(name, age, isMarried, transactions);
    }
}
