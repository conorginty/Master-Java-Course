package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Encapsulation_Parts;

// Modelling a Player of a Computer Game
// Here we're NOT protecting our variables, and showing the issue with this
public class BadPlayer {
    // We're intentionally using 'public' scope here, to show the issues...
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        health = health - damage;
        if (health <= 0) {
            System.out.println("Player has been killed");
        }
    }

    public int healthRemaining() {
        return health;
    }

}
