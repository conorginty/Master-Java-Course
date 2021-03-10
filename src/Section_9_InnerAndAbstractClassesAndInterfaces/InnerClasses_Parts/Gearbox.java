package Section_9_InnerAndAbstractClassesAndInterfaces.InnerClasses_Parts;

// Part of 127.

// Highlighting: 2. non-static nested classes (inner class)
// - Useful when it doesn't make sense to refer to a class without its outer class
// - e.g. if we're modelling an engine, we may have a gearbox class and a gear class

// N.B. - It doesn't make sense, in this scenario, to talk about Gears, unless we're talking about a Gearbox
import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
//    private int gearNumber = 0; // This is too ambiguous, as it conflicts with the same field with the Gear's gearNumber field
    // Better to rename to avoid any confusion
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        gears.add(neutral);
        // Adding all gears by default when instantiating a gearbox
        for (int i=0; i < maxGears; i++) {
            addGear(i, i*5.3);
        }
    }

    public void operateClutch(boolean in) {
        clutchIsIn = in;
    }

    public void addGear(int gearNumber, double ratio) {
        boolean validGearNumber = gearNumber > 0 && gearNumber <= maxGears;
        if (validGearNumber) {
            gears.add(new Gear(gearNumber, ratio));
        }
    }

    public void changeGear(int desiredGearNumber) {
        boolean validGear = desiredGearNumber >= 0 && desiredGearNumber < gears.size() && clutchIsIn;
        if (validGear) {
            currentGear = desiredGearNumber;
            System.out.println("Gear " + desiredGearNumber + " selected.");
        } else {
            System.out.println("Problem changing gears");
            currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Car not moving");
            return 0.0;
        }
        return revs * gears.get(currentGear).ratio;
    }

    // === Creating a PRIVATE Gear inner class (so that the only way it can be 'accessed' is via the Gearbox) ===
    private class Gear {
        private int gearNumber; // This is "shadowing" the gearNumber field in the Gearbox class (i.e. this refers to the Gear's gearNumber, NOT the gearbox's gearNumber
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber; // N.B. - This refer's to the gearNumber of the Gear class, NOT the Gearbox class
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * ratio;
        }

        // N.B. - Instances of Gear have got access to all the methods and fields of the outer gearbox class
        // (even those marked as private)
    }
}
