package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.OOP_Master_Challenge.MyAttempt;

public class DeluxeBurger extends Hamburger{
    private boolean comesWithChips;
    private boolean comesWithDrink;

    public DeluxeBurger() {
        super("Big Kahuna Burger", "Meatball & Turkey", 19.10, "White");
        this.comesWithChips = true;
        this.comesWithDrink = true;
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("No extra toppings are allowed");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("No extra toppings are allowed");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("No extra toppings are allowed");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("No extra toppings are allowed");
    }
}
