package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Composition_Parts.Challenge.MyAttempt;

public class Main {
    public static void main(String[] args) {
        // Bedroom Components and Room itself
        Furniture bed = new Furniture("Bed", 10, "For Sleeping",
                300, true, true, true);
        Wall bedroomWall = new Wall(20, 30, true);
        Room bedroom = new Room("Bedroom", 100, 30, 25, bed, bedroomWall);
        bedroom.talkAboutRoom();
        System.out.println("===============");

        Appliance fridge = new Appliance("Fridge", 8, "For Storing Food",
                500, true, false);
        Wall kitchenWall = new Wall(15, 20, false);
        Room kitchen = new Room("Kitchen", 70, 20, 25, fridge, kitchenWall);
        kitchen.talkAboutRoom();
        System.out.println("===============");

        House house = new House(200, 40, 80, false, "Red",
                123, bedroom, kitchen);
        house.tellAllRooms();
    }
}
