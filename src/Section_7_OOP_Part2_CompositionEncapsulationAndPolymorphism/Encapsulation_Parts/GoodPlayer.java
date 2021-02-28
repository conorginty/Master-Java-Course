package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Encapsulation_Parts;

public class GoodPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public GoodPlayer(String name, int hitPoints, String weapon) {
        this.name = name;
        // Adding some basic validation for health
        if (hitPoints > 0 && hitPoints <= 100) {
            this.hitPoints = hitPoints;
        } // else, health will be 100???
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        hitPoints = hitPoints - damage;
        if (hitPoints <= 0) {
            System.out.println("Player has been killed");
        }
    }

    public int healthRemaining() {
        return hitPoints;
    }
}
