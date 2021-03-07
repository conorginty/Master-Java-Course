package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.AutoboxingAndUnboxing_Parts.Challenge.MyAttempt;

import Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.AutoboxingAndUnboxing_Parts.Challenge.Solution.Customer;

import java.util.ArrayList;

public class Bank {
    private String name;
    private String headquartersLocation;
    private ArrayList<Branch> branches;

    public Bank(String name, String headquartersLocation, ArrayList<Branch> branches) {
        this.name = name;
        this.headquartersLocation = headquartersLocation;
        this.branches = branches;
    }

    public boolean addBranch(Branch branch) {
        int foundIndex = findBranch(branch);
        if (foundIndex >= 0) {
            System.out.println("Branch: " + branch.getName() + " already exists. Branch not added");
            return false;
        }
        // Otherwise, the Branch doesn't exist in the Bank's branches
        System.out.println("Adding Branch: " + branch.getName() + " now.");
        branches.add(branch);
        return true;
    }

//    public boolean addCustomerToBranch(Customer customer, Branch branch) {
//        int branchIndex = findBranch(branch);
//        if (branchIndex >= 0) {
//            // Branch exists. Now see if Customer exists
//            int customerIndex = branch.f
//        }
//    }

    // === Locate a Branch ===
    private int findBranch(Branch branch) {
        return branches.indexOf(branch);
    }

    private int findBranch(String branchName) {
        for (int i=0; i < branches.size(); i++) {
            Branch current = branches.get(i);
            if (current.getName().equals(branchName)) {
                // Then the branch exists with the Bank
                return i;
            }
        }
        return -1;
    }
}
