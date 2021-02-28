package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Polymorphism_Parts.MyTesting;

public class Drummer extends Musician {
    private boolean usesDrumsticks;

    public Drummer(String name, int age, Instrument instrument, boolean sings, boolean usesDrumsticks) {
        super(name, age, instrument, sings);
        this.usesDrumsticks = usesDrumsticks;
    }

    @Override
    public void introduce() {
        super.introduce();
        if (usesDrumsticks) {
            System.out.println("I also use Drumsticks!");
        } else {
            System.out.println("I just hit the drum kit with my hands!");
        }
    }
}
