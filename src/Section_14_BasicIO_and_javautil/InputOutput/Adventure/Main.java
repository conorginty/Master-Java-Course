package Section_14_BasicIO_and_javautil.InputOutput.Adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Locations locations = new Locations();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");

        // Starting location
//        int loc = 1;
        int loc = 64;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            // 1 extra problem that exposes our Location class, we can do the following;
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
