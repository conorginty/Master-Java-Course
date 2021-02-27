package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Coding_Exercises;

public class Wall {
    // Instance Variables
    private double width;
    private double height;

    // == Constructors ===

    // All-Arg Constructor
    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // No Arg Constructor
    public Wall() {
        this(1.0, 1.0);
    }

    // Instance Methods

    // === Getters ===

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // === Setters ===

    public void setWidth(double width) {
        if (isValidValue(width)) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }

    public void setHeight(double height) {
        if (isValidValue(height)) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    // === Extras ===

    public boolean isValidValue(double value) {
        return value >= 0;
    }

    public double getArea() {
        return width * height;
    }
}
