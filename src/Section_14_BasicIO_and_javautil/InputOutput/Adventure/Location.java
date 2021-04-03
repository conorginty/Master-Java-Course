package Section_14_BasicIO_and_javautil.InputOutput.Adventure;

import java.util.HashMap;
import java.util.Map;

// Colossal Cave Adventure Game
public class Location {
    // One thing to notes about this class is that we're programming defensively - meaning that anything that
    // doesn't need to be exposed to the outside is NOT exposed, and our fields are marked 'final' so they
    // can't be changed once a Constructor has finished creating a location instance.
    // So, one useful technique that is in the getter for exits map
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
//        this.exits = exits;

        if (exits != null) {
            this.exits = new HashMap<String, Integer>(exits);
        } else {
            this.exits = new HashMap<String, Integer>(); // Empty HashMap
        }
        // Putting in the 0 exit, as it exists in all scenarios
        this.exits.put("Q", 0);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
//        return exits;
        return new HashMap<String, Integer>(exits); // returns a copy of the Map (I THINK???)
        // Instead of just returning the exits map, we're creating a new HashMap and passing our exits from
        // the Constructor. This would be useful as nothing outside of the class can change exits, so the
        // getter returns a copy of the exits, so if the calling program wants to add or remove mappings from
        // it, then the exits mapping field won't be affected (so although we won't be using the location class
        // as a key in the map, we'll use that later to show some ways to make your classes immutable and returning
        // immutable objects from a getter in this way is one of the techniques here to make sure that works.
    }

    protected void addExit(String direction, int locationID) {
        exits.put(direction, locationID);
    }

    // Not required anymore
//    public void addExit(String direction, int locationID) {
//        exits.put(direction, locationID);
//    }
}
