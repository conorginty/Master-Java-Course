package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Polymorphism_Parts.Challenge.Solution;

public class Car {
    private String name;
    private int cylinderCount;
    private boolean engine;
    private int wheelCount;

    public Car(String name, int cylinderCount) {
        this.name = name;
        this.cylinderCount = cylinderCount;
        this.engine = true;
        this.wheelCount = 4;
    }

    // === Getters ===
    public String getName() {
        return name;
    }

    public int getCylinderCount() {
        return cylinderCount;
    }

    // === Extras ===
    public String startEngine() {
        return "Inside Car Class -> startEngine()";
    }

    public String accelerate() {
        return "Inside Car Class -> accelerate()";
    }

    public String brake() {
        return "Inside Car Class -> brake()";
    }
}
