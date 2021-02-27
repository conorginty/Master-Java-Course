package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_Parts.Challenge.Solution;

public class Outlander extends Car {
    private int roadServiceMonths;

//    // Usual Scenario (We know the name and size of the Outlander car, but the other attributes may vary)
//    public Outlander(int wheels, int doors, int gears, boolean isManual, int roadServiceMonths) {
//        super("Outlander", "4-Wheel Drive", wheels, doors, gears, isManual);
//        this.roadServiceMonths = roadServiceMonths;
//    }

    // HOWEVER, in this made up scenario, there's only 1 type of outlander, so we know the number of wheels, doors etc too
    public Outlander(int roadServiceMonths) {
        super("Outlander", "4-Wheel Drive", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        // rate = difference in speed from the current speed
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else if (newVelocity > 30 && newVelocity <= 40) {
            changeGear(4);
        } else if (newVelocity > 40 && newVelocity <= 50) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
