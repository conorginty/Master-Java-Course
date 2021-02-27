package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Coding_Exercises.PoolAreaExercise;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

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

    protected boolean isValidValue(double value) {
        return value >= 0;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }
}
