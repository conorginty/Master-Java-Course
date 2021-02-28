package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Composition_Parts.Challenge.Solution;

public class Bed {
    private String style;
    private int pillowCount;
    private int height;
    private int sheetCount;
    private int quiltCount;

    public Bed(String style, int pillowCount, int height, int sheetCount, int quiltCount) {
        this.style = style;
        this.pillowCount = pillowCount;
        this.height = height;
        this.sheetCount = sheetCount;
        this.quiltCount = quiltCount;
    }

    public void make() {
        System.out.println("Making the Bed...");
    }

    public String getStyle() {
        return style;
    }

    public int getPillowCount() {
        return pillowCount;
    }

    public int getHeight() {
        return height;
    }

    public int getSheetCount() {
        return sheetCount;
    }

    public int getQuiltCount() {
        return quiltCount;
    }
}
