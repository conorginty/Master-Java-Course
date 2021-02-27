package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Coding_Exercises;

public class Person {

    // Instance Variables
    private String firstName;
    private String lastName;
    private int age;

    // Instance Methods

    // === Getters ===
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // === Setters ===
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (isValidAge(age)) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    // === Extras ===
    public boolean isValidAge(int age) {
        return age > 0 && age <= 100;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    public String getFullName() {
        if (isEmpty(firstName) && isEmpty(lastName)) {
            return "";
        } else if (isEmpty(firstName)) {
            return lastName;
        } else if (isEmpty(lastName)) {
            return firstName;
        }
        return firstName + " " + lastName;
    }

    public boolean isEmpty(String name) {
        return name.equals("");
    }
}
