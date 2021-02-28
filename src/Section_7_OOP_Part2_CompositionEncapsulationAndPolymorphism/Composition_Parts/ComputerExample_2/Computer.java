package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Composition_Parts.ComputerExample_2;

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
    
    // We initially made the getters of the components private (whereas before they were public)
    // HOWEVER, we then decided to remove them altogether (as we are using the components themselves, not their getter
    // to make things less convoluted and complicated)

    // So in order to access them from Main, we'll create a public function that accesses them internally;
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt(1200, 500, "yellow");
    }
}
