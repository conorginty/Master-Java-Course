package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Classes_Parts;

// access modifier: determines what access we want to allow other classes have to this class
// public: this access modifier signifies unrestricted access to the class
// private: no other class can access this class
// protected: only allows classes in the same package to access this class

public class Car {
    // in methods, variables defined within them (local variables) are only accessible within that method
    // We have also see this with variables defined within code blocks (they are local to that code block)

    // Classes, by comparison, allow us to create variables that can be seen and are accessible from anywhere within the class we're creating.
    // These are known as Class Variables, Member Variables OR Fields
    // I THINK HE MEANS INSTANCE VARIABLES, BECAUSE STATIC VARIABLES ARE CLASS VARIABLES I THINK????????????

    // When creating a field, you must also specify an access modifier
    // As a general rule when defining fields, they should be private (so that we're adhering to Encapsulation)
    // This means that the internal representation of an object is going to be hidden from view outside of the object's definition
    // (i.e. the internal workings of a particular object will only be accessible to the object itself only)

    // State/Fields/Characteristics of a Car
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;
    // Because these fields are private, that means they cannot be accessed directly outside of this class
    // (e.g. we CAN access them here (e.g. inside the class or a main method) BUT NOT from a different class (e.g. CAN'T from Classes)

    // We'll create a method to update the model of a car
    public void setModel(String model) {
        // We want to update the value of the field (model) with the value of the parameter passed (model)
        this.model = model;

        // model = model; // If you do it this way, Java will get confused
    }

    public String getModel() {
        return model;
    }

    // Getters and Setters are really important in Java for Encapsulation purposes
    // This allows our Car methods to do validations etc first before setting values, for example.
    // This means we can set up rules related to the class (what's valid and not valid), so that the code creating objects cannot make invalid objects!
    // Let's look at colour as an example, where in our scenario, cars can only be Blue or Red;

    public boolean isBlueOrRed(String colour) {
        String lowerCaseColour = colour.toLowerCase();
        return lowerCaseColour.equals("blue") || lowerCaseColour.equals("red");
    }

    public void setColour(String colour) {
        if (isBlueOrRed(colour)) {
            this.colour = colour;
        } else {
            this.colour = "Invalid Colour";
        }
    }

    public String getColour() {
        return colour;
    }


    // Creating an object from this class by creating a Constructor
    // The Constructor will take the blueprint/template of the object and use it to create instances of the class

    public static void main(String[] args) {
        Car my_car = new Car();
        System.out.println(my_car);         // Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Classes_Parts.Car@38af3868
        // Note that we CAN access private variables directly within the class Car
        System.out.println(my_car.model);   // null
        my_car.model = "Hyundai";
        System.out.println(my_car.model);   // Hyundai
    }
}

