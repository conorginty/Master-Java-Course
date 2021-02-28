package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Composition_Parts.Challenge.Solution;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(12, "Red");

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75, false);

        Bedroom bedroom = new Bedroom("Tim's", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.clickLampButton();
        System.out.println(lamp.isOn());
        bedroom.clickLampButton();
        bedroom.clickLampButton();
        bedroom.clickLampButton();
        System.out.println(lamp.isOn());
    }
}
