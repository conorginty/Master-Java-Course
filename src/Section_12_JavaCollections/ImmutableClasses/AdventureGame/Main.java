package Section_12_JavaCollections.ImmutableClasses.AdventureGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExits = new HashMap<String, Integer>();
        // replace: locations.get\(\d\).addExit
        // with: tempExits.put

        // Effectively the exit
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", tempExits));

        // Adding Exits (i.e. directions people can go from a given location)
        // ===== Room 1 =====
        tempExits = new HashMap<String, Integer>();
        tempExits.put("N", 5);
        tempExits.put("S", 4);
        tempExits.put("E", 3);
        tempExits.put("W", 2);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small bridge", tempExits));
//        tempExits.put("Q", 0);

        // ===== Room 2 =====
        tempExits = new HashMap<String, Integer>();
        tempExits.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill", tempExits));
//        tempExits.put("Q", 0);

        // ===== Room 3 =====
        tempExits = new HashMap<String, Integer>();
        tempExits.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExits));
//        tempExits.put("Q", 0);

        // ===== Room 4 =====
        tempExits = new HashMap<String, Integer>();
        tempExits.put("N", 1);
        tempExits.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream", tempExits));
//        tempExits.put("Q", 0);

        // ===== Room 5 =====
        tempExits = new HashMap<String, Integer>();
        tempExits.put("S", 1);
        tempExits.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest", tempExits));
//        tempExits.put("Q", 0);

        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            // 1 extra problem that exposes our Location class, we can do the following;
            tempExits.remove("S"); // (NOW THIS WON'T WORK, AS WE MODIFIED EXITS IN THE CONSTRUCTOR)
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits(); // Gets a copy of the Map of available exits for a given location
            System.out.print("Available exits are: ");
            for (String key: exits.keySet()) {
                System.out.print(key + ", ");
            }
            System.out.println(); // newline

            String direction = scanner.nextLine().toUpperCase();

            if (direction.length() > 1) {
                // Then it's not a single character command, so we need to do some extra processing
                String[] words = direction.split(" ");
                for (String word: words) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
