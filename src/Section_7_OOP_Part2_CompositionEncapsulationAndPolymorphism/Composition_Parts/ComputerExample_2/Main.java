package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Composition_Parts.ComputerExample_2;

public class Main {
    // 92. Composition

    // In this example, we're going to hide the functionality further, so that we don't allow the calling program
    // (i.e. main) to access the objects directly.
    // (i.e. we'll make the getters of the components of the computer private, and show how to access them in a different way)
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        Computer computer = new Computer(theCase, monitor, motherboard);

        // Accessing the Components of the computer
        computer.powerUp();

        // When deciding whether to use Inheritance or Composition in Java, you probably want to consider Composition 1st
        // The reason is it gives you a lot more flexibility, but it does depend on the solution you're trying to achieve
    }
}
