package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Polymorphism_Parts.MyTesting;

public class Musician {
    private String name;
    private int age;
    private Instrument instrument;
    private boolean sings;

    public Musician(String name, int age, Instrument instrument, boolean sings) {
        this.name = name;
        this.age = age;
        this.instrument = instrument;
        this.sings = sings;
    }

    public void playInstrument() {
        instrument.play();
    }

    public void introduce() {
        System.out.println("******************");
        String intro = "My name is " + name + ", I am " + age + " years old, and I play the " + instrument.getName() + ".";
        if (sings) {
            intro += " I also sing!";
        }
        System.out.println(intro);
    }
}
