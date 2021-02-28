package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Composition_Parts.ComputerExample;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    // E.g. of Composition (Monitor HAS A Resolution, which is a native resolution - it's a component of the Monitor)
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String colour) {
        System.out.println("Drawing a " + colour + " pixel at: (" + x + "," + y + ")");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
