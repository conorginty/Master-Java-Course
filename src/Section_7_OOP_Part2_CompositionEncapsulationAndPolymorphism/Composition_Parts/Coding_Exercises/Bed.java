package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Composition_Parts.Coding_Exercises;

public class Bed {
    private String style;
    private int height;
    private int pillowCount;
    private int sheetCount;
    private int quiltCount;

    public Bed(String style, int height, int pillowCount, int sheetCount, int quiltCount) {
        this.style = style;
        this.height = height;
        this.pillowCount = pillowCount;
        this.sheetCount = sheetCount;
        this.quiltCount = quiltCount;
    }

    public void make() {
        System.out.println("Making bed...");
        System.out.println("Bed is now made");
    }

    public String getStyle() {
        return style;
    }

    public int getHeight() {
        return height;
    }

    public int getPillowCount() {
        return pillowCount;
    }

    public int getSheetCount() {
        return sheetCount;
    }

    public int getQuiltCount() {
        return quiltCount;
    }
}
