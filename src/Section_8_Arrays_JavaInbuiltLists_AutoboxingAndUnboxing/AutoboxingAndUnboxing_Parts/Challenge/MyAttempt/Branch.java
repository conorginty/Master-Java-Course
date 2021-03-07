package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.AutoboxingAndUnboxing_Parts.Challenge.MyAttempt;

import java.util.ArrayList;

public class Branch {

    // IT'S BEEN A FEW DAYS SO CAN'T REMEMBER WHERE I LEFT OFF - Will Revisit another time
    private String name;
    private String cityLocation;
    private ArrayList<Customer> customers;

    public Branch(String name, String cityLocation, ArrayList<Customer> customers) {
        this.name = name;
        this.cityLocation = cityLocation;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public boolean addNewCustomer(Customer customer) {
        int foundIndex = findCustomer(customer);
        if (foundIndex >= 0) {
            // Then the customer already exists
            System.out.println("Customer: " + customer.getName() + " already exists. Customer not added");
            return false;
        }
        // otherwise, customer doesn't already exist, so we should add them
        customers.add(customer);
        return true;
    }

    // === Locate Customer ===
    private int findCustomer(Customer customer) {
        // return index of customer (-1 if it doesn't exist)
        return customers.indexOf(customer);
    }

    private int findCustomer(String customerName) {
        for (int i=0; i < customers.size(); i++) {
            Customer current = customers.get(i);
            if (current.getName().equals(customerName)) {
                // Then the customer exists with the Branch
                return i;
            }
        }
        return -1;
    }
}
