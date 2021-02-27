package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_Parts;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    // === Extras ===
    private void rest() {

    }

    private void moveMuscles() {
        System.out.println("Fish has started moving its muscles");
    }

    private void moveBackFin() {
        System.out.println("Fish has begun to move its back fin");
    }

    // In order to swim, fish must move muscles and their backfin
    public void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
