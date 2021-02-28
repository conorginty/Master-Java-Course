package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Composition_Parts.ComputerExample_2;

// Case stores all the Computer's Components
public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    // E.g. of Composition (Case HAS Dimensions - i.e. the width, height and depth)
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
