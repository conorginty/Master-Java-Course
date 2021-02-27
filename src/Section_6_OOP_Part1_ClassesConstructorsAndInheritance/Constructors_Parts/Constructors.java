package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Constructors_Parts;

public class Constructors {
    public static void main(String[] args) {
        // 79. Constructors - Part 1 + 80. Part 2

        // *** Challenge ***
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number
        // Create getters and setters for each field
        // Create 2 additional methods
        // 1. To allow the customer to deposit funds
        // 2. To allow the customer to withdraw funds (BUT NOT if there are insufficient funds available)

        // We saw in the challenge that setting all the values for our bankAccount instance's fields manually would be very arduous
        // We avoided doing this, as it wasn't necessary to do things like set the customer's name etc.

        // In practice, when we are setting the field values for the first time, it is better to use a Constructor
        // This allows us to initialise the fields of our instance upon creation

        // A Constructor is actually created for you automatically for you by Java
        // When you type in "new ClassName()", this is calling the Constructor, which is designed to physically create the object from the class for us

        // We'll create a new class called "Dog" that will have a Constructor for us to use
    }
}
