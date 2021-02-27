package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_Parts.Challenge.MyAttempt;

public class Car extends Vehicle {
    private int wheelCount;
    private int doorCount;

    private static int carCount = 0;

    // === Constructors ===
    public Car(String model, String colour, boolean hasWheels, boolean hasWings, boolean carriesPassengers, int engineCapacity, int totalFuel, int wheelCount, int doorCount) {
        super(model, colour, hasWheels, hasWings, carriesPassengers, engineCapacity, totalFuel);
        this.wheelCount = wheelCount;
        this.doorCount = doorCount;
        carCount++;
    }

    public Car(String model, String colour) {
        super(model, colour, true, false, true, 1_500, 0);
        carCount++;
    }

    public Car(int wheelCount, int doorCount) {
        this.wheelCount = wheelCount;
        this.doorCount = doorCount;
        carCount++;
    }

    public Car(String model, String colour, int engineCapacity, int totalFuel, int wheelCount, int doorCount) {
        super(model, colour, engineCapacity, totalFuel);
        this.wheelCount = wheelCount;
        this.doorCount = doorCount;
        carCount++;
    }

    public Car(String model, String colour, int wheelCount, int doorCount) {
        super(model, colour);
        this.wheelCount = wheelCount;
        this.doorCount = doorCount;
        carCount++;
    }

    public Car(String model) {
        super(model, "Black", true, false, true, 1_500, 0);
        carCount++;
    }

    public static int getCarCount() {
        return carCount;
    }
}
