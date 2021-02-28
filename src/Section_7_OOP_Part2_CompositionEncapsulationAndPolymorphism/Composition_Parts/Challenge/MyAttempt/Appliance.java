package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Composition_Parts.Challenge.MyAttempt;

public class Appliance extends HouseholdObject {
    private boolean usedForCooking;
    private boolean usedForCleaning;

    public Appliance(String name, int size, String function, double cost, boolean usedForCooking, boolean usedForCleaning) {
        super(name, size, function, cost);
        this.usedForCooking = usedForCooking;
        this.usedForCleaning = usedForCleaning;
    }
}
