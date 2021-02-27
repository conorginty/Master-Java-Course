package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Coding_Exercises.PoolAreaExercise;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public void setHeight(double height) {
        if (isValidValue(height)) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
