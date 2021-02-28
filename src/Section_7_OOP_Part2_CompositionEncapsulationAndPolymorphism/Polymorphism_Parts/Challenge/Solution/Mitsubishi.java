package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Polymorphism_Parts.Challenge.Solution;

public class Mitsubishi extends Car {
    public Mitsubishi(String name, int cylinderCount) {
        super(name, cylinderCount);
    }

    // Overriding the Extra Methods from Car

    @Override
    public String startEngine() {
        return "Inside Mitsubishi Class -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Inside Mitsubishi Class -> accelerate()";
    }

    @Override
    public String brake() {
        return "Inside Mitsubishi Class -> brake()";
    }
}
