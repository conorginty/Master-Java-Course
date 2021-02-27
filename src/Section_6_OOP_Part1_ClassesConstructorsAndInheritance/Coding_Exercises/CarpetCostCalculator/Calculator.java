package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Coding_Exercises.CarpetCostCalculator;

public class Calculator {
    // Instance Variables
    private Floor floor;
    private Carpet carpet;

    // Constructor
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        double area = floor.getArea();
        double cost = carpet.getCost();

        return area * cost;
    }
}
