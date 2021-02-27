package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Constructors_Parts;

public class Dog {
    private String species;
    private String name;
    private int age;
    private boolean hasShaggyCoat;

    // No Arg Constructor
    public Dog() {
        // Creating instance with default fields that we have decided upon
        this("Rottweiler", "Spike", 3, false);
        System.out.println("Empty Constructor called... Dog instance with default fields created");
    }

    // Constructor with ALL the instance variables
    public Dog(String species, String name, int age, boolean hasShaggyCoat) {
        System.out.println("Constructor with Parameters called...");
        this.species = species;
        this.name = name;
        this.age = age;
        this.hasShaggyCoat = hasShaggyCoat;
    }

    // Constructor with only 3 args
    // Generated using toolbar: Code -> Generate -> Contructor -> selected "name" and "age"
    // Then removed generated code in constructor body and replaced with this() statement.
    public Dog(String name, int age) {
        this("Huskey", name, age, true);
    }

    // === Getters ===
    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isShaggy() {
        return hasShaggyCoat;
    }
}
