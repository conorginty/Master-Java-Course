package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_Parts.Challenge.MyAttempt;

public class Mercedes extends Car {
    private static int mercedesCount = 0;

    public Mercedes(String model, String colour) {
        super(model, colour);
        mercedesCount++;
    }

    public Mercedes(String model) {
        super(model);
        mercedesCount++;
    }

    public static int getMercedesCount() {
        return mercedesCount;
    }

    public static int getPorscheCount() {
        return mercedesCount;
    }
}
