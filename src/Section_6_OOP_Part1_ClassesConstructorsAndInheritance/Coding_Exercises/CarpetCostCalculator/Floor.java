package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Coding_Exercises.CarpetCostCalculator;

public class Floor {
    // Instance Variables
    private double width;
    private double length;

    // == Constructors ===

    // All-Arg Constructor
    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Instance Methods

    // === Getters ===
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    // === Setters ===
    public void setWidth(double width) {
        if (isValidValue(width)) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }

    public void setLength(double length) {
        if (isValidValue(length)) {
            this.length = length;
        } else {
            this.length = 0;
        }
    }

    // === Extras ===

    public boolean isValidValue(double value) {
        return value >= 0;
    }

    public double getArea() {
        return width * length;
    }
}
