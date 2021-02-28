package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.OOP_Master_Challenge.Solution;

public class DeluxeBurger extends Hamburger {

    private final String CANT_ADD_ADDITIONAL_COMPONENTS_MESSAGE = "Cannot add additional items to a Deluxe Burger";

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.50, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Chips", 1.85);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println(CANT_ADD_ADDITIONAL_COMPONENTS_MESSAGE);
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println(CANT_ADD_ADDITIONAL_COMPONENTS_MESSAGE);
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println(CANT_ADD_ADDITIONAL_COMPONENTS_MESSAGE);
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println(CANT_ADD_ADDITIONAL_COMPONENTS_MESSAGE);
    }
}
