package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.AutoboxingAndUnboxing_Parts.Challenge.Solution;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            // Then customer doesn't already exist in the Branch, so we can add them
            Customer customer = new Customer(customerName, initialTransaction);
            customers.add(customer);
            return true;
        }
        return false;
    }

    // Similar to newCustomer, but we're checking to make sure the customer is on file, and if it's not we return false
    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            // Then the customer exists in the branch so update their transactions (by appending to it)
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    // === Locate Customer === (Private as it's only used internally in the Branch)
    private int findCustomer(Customer customer) {
        // return index of customer (-1 if it doesn't exist)
        return customers.indexOf(customer);
    }

    private Customer findCustomer(String customerName) {
        for (int i=0; i < customers.size(); i++) {
            Customer current = customers.get(i);
            if (current.getName().equals(customerName)) {
                // Then the customer exists with the Branch
                return current;
            }
        }
        return null;
    }
}
