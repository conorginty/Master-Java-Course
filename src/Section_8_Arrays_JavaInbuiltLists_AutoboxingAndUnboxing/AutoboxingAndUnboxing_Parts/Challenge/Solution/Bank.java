package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.AutoboxingAndUnboxing_Parts.Challenge.Solution;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            // Branch doesn't exist
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomerToBranch(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            // Branch exists. Now add the Customer
            boolean result = branch.newCustomer(customerName, transaction);
            // Will return true if the customer DOESN'T exist, or false if they do
            return result;
        }
        // Branch doesn't exist
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            // Branch exists. Now add the Customer
            boolean result = branch.addCustomerTransaction(customerName, transaction);
            return result;
        }
        // Branch doesn't exist
        return false;
    }

    // === Locate a Branch ===
    private Branch findBranch(String branchName) {
        for (int i=0; i < branches.size(); i++) {
            Branch current = branches.get(i);
            if (current.getName().equals(branchName)) {
                // Then the branch exists with the Bank
                return current;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            // Branch exists
            System.out.println("Customer Details for Branch: " + branch.getName());
//            System.out.println("Customer Details for Branch: " + branchName); // Could alternatively do this, but above is better practice
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            // Now we'll print these details out
            for (int i=0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("[" + (i+1) + "] " + "Customer: " + branchCustomer.getName());
                if (showTransactions) {
                    System.out.println("Transactions: ");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j=0; j < transactions.size(); j++) {
                        // Unboxing happening here
                        System.out.println("{" + (j+1) + "} " + "Transaction: " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        // Branch doesn't exist
        return false;
    }
}


















