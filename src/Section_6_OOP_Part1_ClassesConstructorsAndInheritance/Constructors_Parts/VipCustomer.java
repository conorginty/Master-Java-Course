package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Constructors_Parts;

public class VipCustomer {
    // *** Challenge ***
    // Create a class VipCustomer
    // It should have 3 fields: name, credit limit, email address
    // Create 3 Constructors;
    // 1st Constructor: empty - should call the constructor with 3 parameters with default values
    // 2nd Constructor: should pass on the 2 values it receives and add a default value for the 3rd field
    // 3rd Constructor: should initialise all fields with default values
    // Create getters for each field
    // Test and confirm it works

    private String name;
    private int creditLimit;
    private String emailAddress;

    // 3rd Constructor
    public VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    // 1st Constructor
    public VipCustomer() {
        this("Tom", 10_000, "tom@gmail.com");
    }

    // 2nd Constructor
    public VipCustomer(String name, String emailAddress) {
        this(name, 25_000, emailAddress);
    }

    // === Getters ===
    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
