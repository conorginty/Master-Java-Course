package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Composition_Parts.Challenge.MyAttempt;

public class HouseholdObject {
    private String name;
    private int size;
    private String function;
    private double cost;

    public HouseholdObject(String name, int size, String function, double cost) {
        this.name = name;
        this.size = size;
        this.function = function;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }
}
