package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.OOP_Master_Challenge.Solution;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is: " + hamburger.itemizeHamburger());
        System.out.println("========");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is: " + healthyBurger.itemizeHamburger());
        System.out.println("========");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("Total Deluxe Burger price is: " + deluxeBurger.itemizeHamburger());
        deluxeBurger.addHamburgerAddition1("Cheese", 2.43);
        deluxeBurger.addHamburgerAddition2("Mushrooms", 1.88);
        System.out.println("Total Deluxe Burger price is: " + deluxeBurger.itemizeHamburger());
    }
}
