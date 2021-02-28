package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.OOP_Master_Challenge.Solution;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    // Because we know the name and bread type for our healthy burger, we can hard code them.
    // That means we only need a Constructor that takes in the meat and price

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Brown Rye");
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        // Looks after the hamburgerAddition names and prices
        double hamburgerPrice = super.itemizeHamburger();

        // Looks after the healthyAddition names and prices
        if (healthyExtra1Name != null) {
            hamburgerPrice += healthyExtra1Price;
            printAdditionalToppingMessage(healthyExtra1Name, healthyExtra1Price);
        }
        if (healthyExtra2Name != null) {
            hamburgerPrice += healthyExtra2Price;
            printAdditionalToppingMessage(healthyExtra2Name, healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
