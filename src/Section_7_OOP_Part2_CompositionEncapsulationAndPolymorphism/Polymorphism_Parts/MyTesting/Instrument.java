package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Polymorphism_Parts.MyTesting;

public class Instrument {
    private String name;
    private int size;
    private double weight;
    private double cost;
    private String category;
    private String condition;

    public Instrument(String name, int size, double weight, double cost, String category, String condition) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.cost = cost;
        this.category = category;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public void play() {
        System.out.println("Playing the: " + name);
    }
}
