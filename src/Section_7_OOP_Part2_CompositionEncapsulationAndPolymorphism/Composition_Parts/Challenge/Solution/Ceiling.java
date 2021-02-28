package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Composition_Parts.Challenge.Solution;

public class Ceiling {
    private int height;
    private String paintedColour;

    public Ceiling(int height, String paintedColour) {
        this.height = height;
        this.paintedColour = paintedColour;
    }

    public int getHeight() {
        return height;
    }

    public String getPaintedColour() {
        return paintedColour;
    }
}
