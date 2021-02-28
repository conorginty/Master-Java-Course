package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.OOP_Master_Challenge.Solution;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = price;
        System.out.println(name + " hamburger with " + meat + " on a " + breadRollType + " roll, and the price is: " + price);
        // Checking for additional toppings
        if (addition1Name != null) {
            hamburgerPrice += addition1Price;
            printAdditionalToppingMessage(addition1Name, addition1Price);
        }
        if (addition2Name != null) {
            hamburgerPrice += addition2Price;
            printAdditionalToppingMessage(addition2Name, addition2Price);
        }
        if (addition3Name != null) {
            hamburgerPrice += addition3Price;
            printAdditionalToppingMessage(addition3Name, addition3Price);
        }
        if (addition4Name != null) {
            hamburgerPrice += addition4Price;
            printAdditionalToppingMessage(addition4Name, addition4Price);
        }

        return hamburgerPrice;
    }

    protected void printAdditionalToppingMessage(String additionalTopping, double price) {
        System.out.println("Added " + additionalTopping + " for an extra: " + price);
    }
}
