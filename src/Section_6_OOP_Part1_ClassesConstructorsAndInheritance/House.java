package Section_6_OOP_Part1_ClassesConstructorsAndInheritance;

public class House {
    private String colour;

    public House(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public static void main(String[] args) {
        // instantiate blue house then assign ANOTHER reference to it;
        House blueHouse = new House("blue");
        House anotherReferenceToBlueHouse = blueHouse;

        System.out.println(blueHouse.getColour());
        System.out.println(anotherReferenceToBlueHouse.getColour());

        anotherReferenceToBlueHouse.setColour("red");
        System.out.println(blueHouse.getColour());
        System.out.println(anotherReferenceToBlueHouse.getColour());

        House yellowHouse = new House("yellow");
        anotherReferenceToBlueHouse = yellowHouse;

        System.out.println(blueHouse.getColour()); // red
        System.out.println(yellowHouse.getColour()); // yellow
        System.out.println(anotherReferenceToBlueHouse.getColour()); // yellow
    }
}


