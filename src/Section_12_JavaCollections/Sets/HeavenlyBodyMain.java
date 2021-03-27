package Section_12_JavaCollections.Sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HeavenlyBodyMain {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        // === Mercury ===
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // === Venus ===
        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // === Earth ===
        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // Adding the moon to Earth's moons

        // === Mars ===
        temp = new HeavenlyBody("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // Adding the moon to Mar's moons

        tempMoon = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // Adding the moon to Mar's moons

        // === Jupiter ===
        temp = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // Adding the moon to Jupiter's moons

        tempMoon = new HeavenlyBody("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // Adding the moon to Jupiter's moons

        tempMoon = new HeavenlyBody("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // Adding the moon to Jupiter's moons

        tempMoon = new HeavenlyBody("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // Adding the moon to Jupiter's moons

        // === Saturn ===
        temp = new HeavenlyBody("Saturn", 10_759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // === Uranus ===
        temp = new HeavenlyBody("Uranus", 30_660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // === Neptune ===
        temp = new HeavenlyBody("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // === Pluto ===
        temp = new HeavenlyBody("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        System.out.println("=== Planets ===");
        for (HeavenlyBody planet: planets) {
            System.out.println(planet.getName());
        }
        System.out.println("----------");

        HeavenlyBody jupiter = solarSystem.get("Jupiter");
        System.out.println("=== Moons of " + jupiter.getName() + " ===");
        for (HeavenlyBody moon: jupiter.getSatellites()) {
            System.out.println(moon.getName());
        }
        System.out.println("----------");

        Set<HeavenlyBody> allMoons = new HashSet<>();
        // === My Attempt ===
        for (HeavenlyBody planet: solarSystem.values()) {
            if (planet.getSatellites().size() > 0) {
                System.out.println("--- " + planet.getName() + " Moons ---");
                for (HeavenlyBody moon: planet.getSatellites()) {
                    System.out.println(moon.getName());
                    allMoons.add(moon);
                }
            }
        }
        System.out.println("--------");
        System.out.println("=== All Moons ===");
        for (HeavenlyBody moon: allMoons) {
            System.out.println(moon.getName());
        }
        System.out.println("============");

        // === Solution ===
        allMoons = new HashSet<>();
        for (HeavenlyBody planet: planets) {
            allMoons.addAll(planet.getSatellites());
        }
        System.out.println("=== All Moons ===");
        for (HeavenlyBody moon: allMoons) {
            System.out.println(moon.getName());
        }
        System.out.println("============");

        // N.B. - 1 thing that confuses people with code like this is that it's only reference to the Objects that
        // are being stored in the Sets - so Europa, for example, appears in the solarSystem Map, AND in the Set of
        // satellites for Jupiter, BUT there's only 1 instance of the HeavenlyBody class for Europa.
        // So, this confusion can lead to a common mistake when dealing with collections, where, in this example, the
        // Sets would contain the names of the Bodies, rather than references to them.
        // So, code like that works, BUT it's the reasoning behind it that is incorrect...
        // So if the HeavenlyBody class contained KBs of information on each body, the faulty reasoning would be that
        // it's more efficient to just store the String name in the sets (or whatever collection you're using), BUT a
        // reference to a String is exactly the same size as a reference to any other object, so nothing is gained, BUT
        // the code has become more complex, coz the actual Object has to be retrieved from the Map before you can get
        // any of its details, so that's an important consideration.
        // If the ID of the Object was an integer, rather than a String, then it might be tempting to store that in the
        // Sets. BUT this is ALSO a false optimisation - on a 32bit JVM, an int and an object reference BOTH take up
        // 4 bytes. On a 64bit machine, the object reference would only be 64bits (8 bytes), but Java 7 uses
        // compressed pointers that can even end up using less space than the 32bit int.

        // However, there is 1 good reason for using the body's name in the sets, and it has nothing to do with using
        // memory more efficiently. (Didn't really get why)

        // Part of 164.

        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
        // N.B. - Different orbital period to the other pluto we created in a previous lesson (i.e. 842 vs 248)
        planets.add(pluto);

        for (HeavenlyBody planet: planets) {
            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
        }
        System.out.println("====================");

        // As we can see, BOTH pluto instances exist in the Set (which clearly we DON'T want)
        // (B.B. - THIS ISN'T THE CASE ANYMORE AFTER WE OVERRIDE THE EQUALS() AND HASHCODE() METHODS!!!!!!!!!!!!!!!!)
        // The reason both objects are accepted into the Set is because they DON'T compare equal
        // If we want to use them as keys in a Map, the exact same thing would've happened.
        // Therefore, the equals() methods MUST be overridden in the HeavenlyBody class.
        // The reason that they don't compare equal is coz the base Object class from which all other classes are
        // derived just defines a very simple equals method that performs Referential Equality (i.e. if 2 references
        // point to the same object, then they're equal, otherwise they're not) (i.e. it uses == to perform comparison).
        // This is why we use .equals() method for comparing Strings, rather than == operator

        // Showing how this works at a base level with Object (just for checking the docs for Object and String's equals methods)
        Object obj = new Object();
        obj.equals(obj);
        "pluto".equals("");

        // Overriding equals() is not that straightforward. If 2 objects compare equal, then their Hash Codes MUST
        // also be the same, so we MUST ALSO override the hashCode() method if you override equals().
        // N.B. - If 2 objects compare equal, then they MUST have the same Hash Code

        System.out.println(jupiter.equals(jupiter));
        System.out.println(jupiter.equals("jupiter"));
    }
}
