package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Polymorphism_Parts.Challenge.Solution;

public class Ford extends Car {
    public Ford(String name, int cylinderCount) {
        super(name, cylinderCount);
    }

    // Overriding the Extra Methods from Car

    @Override
    public String startEngine() {
        return "Inside Ford Class -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Inside Ford Class -> accelerate()";
    }

    @Override
    public String brake() {
        return "Inside Ford Class -> brake()";
    }
}
