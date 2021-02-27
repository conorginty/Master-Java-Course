package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_Parts;

public class Dog extends Animal {

    // Instance Variables (that Dogs DO have, that a generic Animal does not necessarily have);
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // In order to use the Animal class, we need to use the Constructor from that class
    // So we need a Constructor for the Dog class that calls the Inherited class
//    public Dog(String name, int brain, int body, int size, int weight) {
//        // The instance variables from the inherited class have been used as parameters to the Dog Constructor
//        // "super": calls the constructor from the class we're extending/ inheriting from
//        // This allows us to initialise from the Animal class, BUT ALSO we can add more features that are unique to dogs
//        super(name, brain, body, size, weight);
//    }

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // We know that all dogs have a brain and a body, so we don't need to include these as parameters
        super(name, 1, 1, size, weight);
        // The dog-specific characteristics
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("The poochie is chewing their food!");
    }

    // Overriding the Animal eat() method for Dogs;
    @Override
    public void eat() {
        super.eat();
        System.out.println("More specifically, a Dog is eating...");
        chew();
    }

    public void walk() {
        System.out.println("Dog is walking");
        move(5);
    }

    public void run() {
        System.out.println("Dog is running");
        move(10);
    }

    @Override
    public void move(int speed) {
        moveLegs();
        if (speed >= 10) {
            System.out.println("Dog is going really fast!!!");
        } else {
            System.out.println("Dog is going rather slowly");
        }
    }

    private void moveLegs() {
        System.out.println("The Dog's legs have started moving!!");
    }
}
