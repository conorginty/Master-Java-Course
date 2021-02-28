package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Polymorphism_Parts.MyTesting;

public class Main {
    public static void main(String[] args) {
        // Drummer
        Instrument drums = new Instrument("Drums", 10, 20, 800, "Percussion", "Good");
        Drummer drummer = new Drummer("James", 30, drums, false, true);
        drummer.introduce();

        // Guitarist
        Instrument guitar = new Instrument("Guitar", 4, 8, 200, "Strings", "OK");
        Guitarist guitarist = new Guitarist("The Edge", 40, guitar, true, false);
        guitarist.introduce();

        // Flautist
        Instrument flute = new Instrument("Flute", 2, 4, 1_200, "Wind", "Perfect");
        Flautist flautist = new Flautist("Ruth", 25, flute, true);
        flautist.introduce();
        System.out.println("============================");

        // Create a Band of Musicians
        Musician[] band = new Musician[] {drummer, guitarist, flautist};

        // For Each Loop
        for (Musician musician : band) {
            musician.playInstrument();
        }
        System.out.println("//////////////////");

        // Iterator For Loop
        for (int i=0; i < band.length; i++) {
            band[i].playInstrument();
        }
    }
}
