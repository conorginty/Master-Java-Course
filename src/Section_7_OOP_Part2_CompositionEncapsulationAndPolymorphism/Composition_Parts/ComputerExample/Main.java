package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Composition_Parts.ComputerExample;

public class Main {
    // 91. Composition
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        Computer computer = new Computer(theCase, monitor, motherboard);

        // Accessing the Components of the computer
        computer.getMonitor().drawPixelAt(1500, 1200, "Red");
        computer.getMotherboard().loadProgram("Windows 1.0");
        computer.getTheCase().pressPowerButton();

        // So these are the main differences between Inheritance and Composition
        // - We created our case, monitor, motherboard and created a computer with these components by "putting them together"
        // - We need to access these components using getters, then use their methods etc in order to interact with them
    }
}
