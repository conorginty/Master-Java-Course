package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Composition_Parts.Challenge.Solution;

public class Lamp {
    private String style;
    private boolean batteryPowered;
    private int globRating;
    private boolean on;

    public Lamp(String style, boolean batteryPowered, int globRating, boolean on) {
        this.style = style;
        this.batteryPowered = batteryPowered;
        this.globRating = globRating;
        this.on = on;
    }

    public void switchOnOrOff() {
        if (on) {
            on = false;
        } else {
            on = true;
        }
    }

    public void clickPowerButton() {
        if (on) {
            System.out.println("Turning lamp off...");
        } else {
            System.out.println("Turning lamp on...");
        }
        // Switch off if on, OR on if off
        switchOnOrOff();
    }

    public boolean isOn() {
        return on;
    }

    public String getStyle() {
        return style;
    }

    public boolean isBatteryPowered() {
        return batteryPowered;
    }

    public int getGlobRating() {
        return globRating;
    }
}
