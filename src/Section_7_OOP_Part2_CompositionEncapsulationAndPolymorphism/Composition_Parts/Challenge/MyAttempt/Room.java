package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Composition_Parts.Challenge.MyAttempt;

public class Room {
    private String name;
    private int size;
    private int width;
    private int height;

    private HouseholdObject householdObject;
    private Wall wall;

    public Room(String name, int size, int width, int height, HouseholdObject householdObject, Wall wall) {
        this.name = name;
        this.size = size;
        this.width = width;
        this.height = height;
        this.householdObject = householdObject;
        this.wall = wall;
    }

    public void talkAboutRoom() {
        System.out.println("Welcome to the " + name);
        System.out.println("In here we have a " + householdObject.getName());
        System.out.println("The area of the wall is " + wall.getArea());
    }

    public String getName() {
        return name;
    }
}
