package Section_12_JavaCollections.Sets;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
//        return satellites;
        // INSTEAD Creating a new HashSet of the current contents of our satellite
        return new HashSet<>(satellites);
        // This means that the code that's calling this object doesn't have access to our original HashSet, and
        // we have determined in previous videos that it would be possible to do that, unless we specifically
        // do something like the above line so they can't make any changes
    }

    // Option to add a moon
    public boolean addMoon(HeavenlyBody moon) {
        return satellites.add(moon);
    }

    // To override the equals() method, we need to consider how we wish to uniquely-identify our instances.
    // In this example, we'll use the name field
    @Override
//    public boolean equals(HeavenlyBody obj) { // Overloading equals (Mistake - won't work!)
    public boolean equals(Object obj) { // // Overriding equals (Correct!)
        // If the object is compared with itself, return true
        if (this == obj)   {
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass()); // For debugging purposes
        System.out.println("this.getClass() is " + this.getClass()); // For debugging purposes
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    // Not sure what this was from...
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, orbitalPeriod, satellites);
//    }

    @Override
    public int hashCode() {
//        return this.name.hashCode();
        // The line above will work coz we've typed the Sets and the Map using Generics (so there's little danger of
        // comparing, for example, a HeavenlyBody to a String), BUT it's NOT good practice to do this (coz a
        // HeavenlyBody called "Pluto" would probably have a different hash code to the String "Pluto"

        // The way you generate Hash Codes is up to you, as long as the same object will always generate the same
        // has code during any execution of your program and also as long as objects that compare equal have the same
        // hash code. Once that's done, then the requirement is satisfied.

//        System.out.println("hashCode() called...");
        // we'll do this by adding a number that won't overflow an int and we get a non-zero number
        return this.name.hashCode() + 57;
    }
}
