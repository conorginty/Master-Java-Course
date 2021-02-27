package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Classes_Parts;

public class Classes {
    public static void main(String[] args) {
        // 77. Classes - Part 1 + 78. Part 2

        // Real-life objects have 2 major characteristics;
        // 1. State
        // - e.g. for a Computer object this may be RAM, the OS it's running, the size of the monitor etc
        // - e.g. for an Insect it may be age, species, number of legs, conscious state (if it's sleeping or not) etc
        // 2. Behaviour
        // - e.g. for a Computer object this may be booting up, shutting down, printing something
        // - e.g. for an Insect it may be eating, drinking, fighting, carrying food etc

        // Software objects also consist of states and behaviours.
        // - They store their states in fields (variables)
        // - They expose their behaviour with methods

        // Class = template/blueprint for creating objects

        // Primitives are fairly limited in what can be done with them.
        // Classes are effectively user-defined datatypes (though this isn't strictly true)

        // Let's create a new class: "Car" (see the separate java file: Car)
        // -----------------------

        // Now let's instantiate a car
        Car mercedes = new Car();

        System.out.println(mercedes); // Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Classes_Parts.Car@77459877

        // Using the Car's setter method to update the value of Model
        mercedes.setModel("Benz");
        // Using the Car's getter method to access the value of Model
        String carInstancesModelName = mercedes.getModel();
        System.out.println("We have set the value of model to: " + carInstancesModelName); // Benz

        // Showing how Setters and Getters can be used in combo with other methods to define rules;

        System.out.println(mercedes.getColour()); // null

        mercedes.setColour("Green");
        System.out.println(mercedes.getColour()); // Invalid Colour
        mercedes.setColour("Black");
        System.out.println(mercedes.getColour()); // Invalid Colour
        mercedes.setColour("Red");
        System.out.println(mercedes.getColour()); // Red
        mercedes.setColour("Purple");
        System.out.println(mercedes.getColour()); // Invalid Colour
        mercedes.setColour("Blue");
        System.out.println(mercedes.getColour()); // Blue
    }
}
