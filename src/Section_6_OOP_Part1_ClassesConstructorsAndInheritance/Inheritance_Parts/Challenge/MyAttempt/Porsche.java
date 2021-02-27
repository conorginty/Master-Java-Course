package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_Parts.Challenge.MyAttempt;

public class Porsche extends Car {
    private static int porscheCount = 0;

    public Porsche(String model, String colour) {
        super(model, colour);
        porscheCount++;
    }

    public Porsche(String model) {
        super(model);
        porscheCount++;
    }

    public static int getPorscheCount() {
        return porscheCount;
    }
}
