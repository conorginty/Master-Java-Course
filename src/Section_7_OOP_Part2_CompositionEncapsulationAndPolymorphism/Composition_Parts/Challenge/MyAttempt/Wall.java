package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Composition_Parts.Challenge.MyAttempt;

public class Wall {
    private double width;
    private double height;
    private boolean painted;

    public Wall(double width, double height, boolean painted) {
        this.width = width;
        this.height = height;
        this.painted = painted;
    }

    public double getArea() {
        return width * height;
    }

    public boolean isPainted() {
        return painted;
    }
}

