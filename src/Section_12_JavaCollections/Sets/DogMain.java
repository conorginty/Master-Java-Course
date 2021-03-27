package Section_12_JavaCollections.Sets;

public class DogMain {
    public static void main(String[] args) {
        Labrador labRover = new Labrador("Rover");
        Dog dogRover = new Dog("Rover");

        System.out.println(dogRover.equals(labRover)); // true
        System.out.println(labRover.equals(dogRover)); // false (too specific) - Dog is NOT an instance of Labrador
        // N.B. - Note that the above happens when we override equals() method in Labrador!!
        // N.B. - Note that these comparisons are FAILING on a requirement of equals() method: Symmetry!!
        // To fix this, we should NOT override the equals() method in Labrador

        System.out.println(dogRover.equals(labRover)); // true
        System.out.println(labRover.equals(dogRover)); // true
        // NOW it's fine!
        // To ensure that equals() can NOT be overridden in subclasses of Dog, we'll make equals() final
    }
}
