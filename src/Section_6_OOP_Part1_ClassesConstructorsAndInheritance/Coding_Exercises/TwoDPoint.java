package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Coding_Exercises;

import java.awt.*;

public class TwoDPoint {
    // Instance Variables
    private int x;
    private int y;

    // == Constructors ===

    // All-Arg Constructor
    public TwoDPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // No Arg Constructor
    public TwoDPoint() {
        this(1, 1);
    }

    // Instance Methods

    // === Getters ===

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // === Setters ===

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // === Extras ===

    public double distance() {
        double equation = Math.sqrt( Math.pow((0 - x), 2) + Math.pow((0 - y), 2) );
        return Math.abs(equation);
    }

    public double distance(int x, int y) {
        double equation = Math.sqrt( Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2) );
        return Math.abs(equation);
    }

    public double distance(TwoDPoint point) {
        int others_x = point.getX();
        int others_y = point.getY();

        double equation = Math.sqrt( Math.pow((others_x - this.x), 2) + Math.pow((others_y - this.y), 2) );
        return Math.abs(equation);
    }
}
