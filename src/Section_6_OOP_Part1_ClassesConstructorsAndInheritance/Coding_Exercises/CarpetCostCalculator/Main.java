package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Coding_Exercises.CarpetCostCalculator;

public class Main {
    public static void main(String[] args) {
        Floor floor = new Floor(2.75, 4d);
        Carpet carpet = new Carpet(3.5);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("Total Cost = " + calculator.getTotalCost());

        floor = new Floor(5.4, 4.5);
        carpet = new Carpet(1.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("Total Cost = " + calculator.getTotalCost());
    }
}
