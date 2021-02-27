package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_Parts;

public class Animal {
    // States that all animals have
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    // Constructor
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    // === Extras ===
    public void eat() {
        System.out.println("Animal is eating...");
    }

    // Because animals like dogs can walk or run, perhaps our Animal's move method should accept a speed
    // To determine what kind of movement is happening...
    public void move(int speed) {
        String pace = speed >= 10 ? "quickly" : "slowly";
        System.out.println("Animal is moving " + pace);
    }

    // === Getters ===
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
