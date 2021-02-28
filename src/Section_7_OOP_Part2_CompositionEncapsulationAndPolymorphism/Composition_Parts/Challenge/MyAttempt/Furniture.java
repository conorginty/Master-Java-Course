package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Composition_Parts.Challenge.MyAttempt;

public class Furniture extends HouseholdObject {
    private boolean canSitOn;
    private boolean canEatOn;
    private boolean canSleepOn;

    public Furniture(String name, int size, String function, double cost, boolean canSitOn, boolean canEatOn, boolean canSleepOn) {
        super(name, size, function, cost);
        this.canSitOn = canSitOn;
        this.canEatOn = canEatOn;
        this.canSleepOn = canSleepOn;
    }
}
