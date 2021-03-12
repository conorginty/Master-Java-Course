package Section_11_NamingConventions_Packages_Static_Final_KWs.FinalStatement;

public class SomeClass {


    private static int instanceCounter = 0;
    public final int instanceNumber;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        instanceCounter++;
        instanceNumber = instanceCounter;
        System.out.println(name + " created. Instance number is: " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }

    // Usually you assign the value when declaring the field, but if you prefer you can use a constructor instead.
    // 1 reason you might want and need to initialise the variable in the constructor, would be if its value is
    // a result of some calculation that may rely on some other code.
    // e.g. When reading a record from a database, you might want to store the class instance's unique database
    // key, which wouldn't be available until you read the record form the database, and by then ready to create
    // the class instance from the database field.
    // We haven't looked at databases yet, so as a mechanism to show this work, we'll create a mechanism that
    // ensures that every instance of a class has a unique instance number (or ID). This will require us to track
    // a variable each time a new class instance is created, so this is an ideal candidate for using a class var.
}
