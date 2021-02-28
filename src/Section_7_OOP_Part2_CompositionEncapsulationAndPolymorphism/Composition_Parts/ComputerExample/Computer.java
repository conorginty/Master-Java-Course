package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Composition_Parts.ComputerExample;

public class Computer {
    // Computer is Composed of these 3 classes that we have defined
    private Case theCase; // N.B. - Couldn't use 'case' as variable name, as it's a Java keyword
    private Monitor monitor;
    private Motherboard motherboard;

    public Computer(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
