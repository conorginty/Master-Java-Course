package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Coding_Exercises.CylinderExercise;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public void setHeight(double height) {
        if (height >= 0) {
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
