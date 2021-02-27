package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Coding_Exercises.CarpetCostCalculator;

public class Carpet {
    // Instance Variables
    private double cost;

    // === Constructors ===

    // All Arg Constructor
    public Carpet(double cost) {
        this.cost = cost;
    }

    // Instance Methods

    // === Getters ===
    public double getCost() {
        return cost;
    }

    // === Setters ===
    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = 0;
        }

    }
}
