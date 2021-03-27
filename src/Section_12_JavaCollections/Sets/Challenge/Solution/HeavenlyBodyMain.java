package Section_12_JavaCollections.Sets.Challenge.Solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HeavenlyBodyMain {
    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        // === Mercury ===
//        HeavenlyBody temp = new HeavenlyBody("Mercury", 88, HeavenlyBody.BodyTypes.PLANET);
        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        // === Venus ===
        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        // === Earth ===
        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // Adding the moon to Earth's moons

        // === Mars ===
        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // Adding the moon to Mar's moons

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // Adding the moon to Mar's moons

        // === Jupiter ===
        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // Adding the moon to Jupiter's moons

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // Adding the moon to Jupiter's moons

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // Adding the moon to Jupiter's moons

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // Adding the moon to Jupiter's moons

        // === Saturn ===
        temp = new Planet("Saturn", 10_759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        // === Uranus ===
        temp = new Planet("Uranus", 30_660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        // === Neptune ===
        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        // === Pluto ===
        temp = new DwarfPlanet("Pluto", 248);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        System.out.println("=== Planets ===");
        for (HeavenlyBody planet: planets) {
            System.out.println(planet.getKey());
        }
        System.out.println("----------");

        HeavenlyBody jupiter = solarSystem.get(HeavenlyBody.makeKey("Jupiter", HeavenlyBody.BodyTypes.PLANET));
        System.out.println("=== Moons of " + jupiter.getKey() + " ===");
        for (HeavenlyBody moon: jupiter.getSatellites()) {
            System.out.println(moon.getKey());
        }
        System.out.println("----------");

        Set<HeavenlyBody> allMoons = new HashSet<>();

        // === Solution ===
        allMoons = new HashSet<>();
        for (HeavenlyBody planet: planets) {
            allMoons.addAll(planet.getSatellites());
        }
        System.out.println("=== All Moons ===");
        for (HeavenlyBody moon: allMoons) {
            System.out.println(moon.getKey());
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

        HeavenlyBody pluto = new DwarfPlanet("Pluto", 842);
        // N.B. - Different orbital period to the other pluto we created in a previous lesson (i.e. 842 vs 248)
        planets.add(pluto);

        for (HeavenlyBody planet: planets) {
            System.out.println(planet);
        }
        System.out.println("====================");

        // Part of 171.

        solarSystem.put(pluto.getKey(), pluto);
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.PLANET))); // null coz no longer a PLANET
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.DWARF_PLANET)));

        System.out.println("******************");
        System.out.println("The solar system contains:");
        for (HeavenlyBody heavenlyBody: solarSystem.values()) {
            System.out.println(heavenlyBody);
        }
    }
}
