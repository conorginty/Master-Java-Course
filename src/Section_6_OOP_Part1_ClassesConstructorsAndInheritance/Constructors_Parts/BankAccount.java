package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Constructors_Parts;

public class BankAccount {
    // Instance Variables
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Instance Methods

    // === Getters ===
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // === Setters ===
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // === Extras ===
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (isBalanceSufficient(amount)) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds. Withdrawal not processed...");
        }
    }

    public boolean isBalanceSufficient(double amount) {
        return balance - amount >= 0;
    }


}
