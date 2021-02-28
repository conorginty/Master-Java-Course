package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Polymorphism_Parts.MyTesting;

public class Guitarist extends Musician{
    private boolean usesPick;

    public Guitarist(String name, int age, Instrument instrument, boolean sings, boolean usesPick) {
        super(name, age, instrument, sings);
        this.usesPick = usesPick;
    }

    @Override
    public void introduce() {
        super.introduce();
        if (usesPick) {
            System.out.println("I use a pick to pick the strings!");
        } else {
            System.out.println("My nails are super long, I just use them to play!");
        }
    }
}
