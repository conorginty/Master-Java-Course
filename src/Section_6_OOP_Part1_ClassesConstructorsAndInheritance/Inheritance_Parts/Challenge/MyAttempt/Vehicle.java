package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_Parts.Challenge.MyAttempt;

public class Vehicle {
    // Instance Variables
    private String model;
    private String colour;
    private boolean hasWheels;
    private boolean hasWings;
    private boolean carriesPassengers;
    private int engineCapacity;
    private int totalFuel;

    int engineRemainingVolume = engineCapacity - totalFuel;

    // === Constructors ===
    public Vehicle(String model, String colour, boolean hasWheels, boolean hasWings, boolean carriesPassengers, int engineCapacity, int totalFuel) {
        this.model = model;
        this.colour = colour;
        this.hasWheels = hasWheels;
        this.hasWings = hasWings;
        this.carriesPassengers = carriesPassengers;
        this.engineCapacity = engineCapacity;
        this.totalFuel = totalFuel;
    }

    public Vehicle() {
        this("Unknown", "Black", true, false, false, 1_000, 1_000);
    }

    public Vehicle(String model, String colour, int engineCapacity, int totalFuel) {
        this(model, colour, true, false, false, engineCapacity, totalFuel);
    }

    public Vehicle(String model, String colour) {
        this(model, colour, true, false, false, 1_000, 0);
    }

    // === Getters ===
    public String getModel() { return model; }

    public String getColour() { return colour; }

    public boolean doesHaveWheels() { return hasWheels; }

    public boolean doesHaveWings() { return hasWings; }

    public boolean doesCarryPassengers() { return carriesPassengers; }

    public int getEngineCapacity() { return engineCapacity; }

    public int getTotalFuel() { return totalFuel; }

    // === Setters ===
    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setTotalFuel(int totalFuel) {
        if (validFuelAmount(totalFuel)) {
            this.totalFuel = totalFuel;
        } else {
            System.out.println("Sorry, your engine capacity is only: " + engineCapacity
                            + " and you already have " + this.totalFuel + " in the engine."
                            + " The most you can fill it up with is: " + (engineCapacity - this.totalFuel));
        }
    }

    // === Extras ===
    public void move() {
        if (hasEnoughFuel()) {
            System.out.println("Vehicle is in motion...");
        } else {
            System.out.println("Need to fill the engine first...");
        }
    }

    public void move(int distance) {
        if (hasEnoughFuel()) {
            System.out.println("We have fuel! Let's see if we can make the trip. Total Fuel currently = " + totalFuel);
            int fuelNeededForTrip = consumeFuel(distance, totalFuel);
            totalFuel -= fuelNeededForTrip;
            System.out.println("Trip may or may not have happened. Current fuel = " + totalFuel);
        } else {
            System.out.println("Need to fill the engine first...");
        }
    }

    public int consumeFuel(int distance, int currentFuel) {
        boolean valid_params = distance >= 0 && currentFuel >= 0;
        if (valid_params) {
            int totalFuel = 0;
            while (distance > 0 && currentFuel > 0) {
                currentFuel -= 10;
                distance--;
                totalFuel += 10;
            }

            if (currentFuel > 0) {
                // Will have enough fuel to make it
                System.out.println("Have enough fuel for the trip!!");
                return totalFuel;
            } else {
                // Won't have enough fuel to make it
                System.out.println("Not enough fuel for the trip...");
                return 0;
            }

        } else {
            System.out.println("Problem with distance or fuel or both");
            return 0;
        }
    }

    public boolean hasEnoughFuel() {
        return totalFuel > 0;
    }

    private boolean validFuelAmount(int amount) {
        return totalFuel + amount <= engineCapacity;
    }
}
