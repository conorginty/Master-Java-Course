package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Composition_Parts.Challenge.MyAttempt;

public class House {
    private int size;
    private int height;
    private int width;
    private boolean hasFrontGarden;
    private String colour;
    private int number;

    private Room bedroom;
    private Room kitchen;

    public House(int size, int height, int width, boolean hasFrontGarden, String colour, int number, Room bedroom, Room kitchen) {
        this.size = size;
        this.height = height;
        this.width = width;
        this.hasFrontGarden = hasFrontGarden;
        this.colour = colour;
        this.number = number;
        this.bedroom = bedroom;
        this.kitchen = kitchen;
    }

    public Room[] getRooms() {
        Room[] allRooms = new Room[]{bedroom, kitchen};
        return allRooms;
    }

    public int getSize() {
        return size;
    }

    public void tellAllRooms() {
        System.out.println("In this house, there are the following rooms:");
        Room[] allRooms = getRooms();
        for (int i=0; i < allRooms.length; i++) {
            System.out.println(allRooms[i].getName());
        }
    }
}
