package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Encapsulation_Parts;

public class Main {
    public static void main(String[] args) {
        BadPlayer badPlayer = new BadPlayer();
        // As we don't have a Constructor, we'll set the fields manually
        // As we have public scope and no setters for the fields, we'll assign them manually
        badPlayer.name = "Conor";
        badPlayer.health = 20;
        badPlayer.weapon = "Sword";

        int damage = 10;
        badPlayer.loseHealth(damage);
        System.out.println("Remaining Health = " + badPlayer.healthRemaining()); // 10

        damage = 11;
        // Now the player should die, as they only have 10 health remaining...
        // HOWEVER, because of the open access of Main to our instance variables, we can "change the rules" to suit our needs
        badPlayer.health = 100;
        badPlayer.loseHealth(damage);
        // Now the player no longer dies...
        System.out.println("Remaining Health = " + badPlayer.healthRemaining()); // 89

        // This can be problematic, and we would want to have control over this process
        // The main should NEVER be able to change the fields directly

        // Another issue is that if we access fields directly from main, that means that if we, for example, change our
        // field names (e.g. name -> fullName), we'll have to change it in BOTH classes! (Problematic)
        System.out.println("============");

        GoodPlayer goodPlayer_1 = new GoodPlayer("Tom", 50, "Baseball Bat");
        System.out.println("Initial Health is: " + goodPlayer_1.healthRemaining()); // 50

        // When instantiating goodPlayer, if we assign an invalid health total, the player will get the default instead.
        GoodPlayer goodPlayer_2 = new GoodPlayer("Jim", 50_000, "Gun");
        System.out.println("Initial Health is: " + goodPlayer_2.healthRemaining()); // 100
    }
}
