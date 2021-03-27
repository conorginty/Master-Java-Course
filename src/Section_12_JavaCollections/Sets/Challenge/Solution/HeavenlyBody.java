package Section_12_JavaCollections.Sets.Challenge.Solution;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
//    private final String name;
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
//    private final BodyTypes bodyType;

    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
//        this.name = name;
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
//        this.bodyType = bodyType;
    }

//    public String getName() {
//        return name;
//    }

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

//    public BodyTypes getBodyType() {
//        return bodyType;
//    }


    public Key getKey() {
        return key;
    }

    // Option to add a satellite
    public boolean addSatellite(HeavenlyBody satellite) {
        return satellites.add(satellite);
    }

    // To override the equals() method, we need to consider how we wish to uniquely-identify our instances.
    // In this example, we'll use the name field
    @Override
//    public boolean equals(HeavenlyBody obj) { // Overloading equals (Mistake - won't work!)
    public boolean equals(Object obj) { // Overriding equals (Correct!)
        // If the object is compared with itself, return true
        if (this == obj)   {
            return true;
        }
        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
//            if (this.name.equals(theObject.getName())) {
//                return this.bodyType == theObject.bodyType;
//            }
            return this.key.equals(theObject.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
//        return this.name.hashCode() + 57 + this.bodyType.hashCode();
        return this.key.hashCode();
    }

    // Making a static method (so that they key can be obtained without needing an instance of HeavenlyBody to call the method on
    public static Key makeKey(String name, BodyTypes bodyType) {
        return new Key(name, bodyType);
    }

    @Override
    public String toString() {
//        return this.name + ": " + this.bodyType + ", " + this.orbitalPeriod;
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }

    public static final class Key {
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object obj) {
            Key key  = (Key) obj;
            if (this.name.equals(key.getName())) {
                return (this.bodyType == key.bodyType);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }
}
