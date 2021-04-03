package Section_14_BasicIO_and_javautil.InputOutput.Adventure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

// It's very handy to implement the Map interface to encapsulation the locations member variable
// In this way we create a class that acts as a Map, BUT we can customise to load its contents from an
// external source (i.e. a disk file in this case)

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    // Part of 231, 232 etc.
    public static void main(String[] args) throws IOException {
        // By specifying 'throws', the Caller knows that an Exception can be thrown from this Method, and
        // because IOException is a Checked Exception, the Caller must either catch the Exception OR also
        // specify that its going to throw it.

//        FileWriter locationsFile = null;
//        locationsFile = new FileWriter("locations.txt");
//        for (Location location: locations.values()) {
//            locationsFile.write(location.getLocationID() + ", " + location.getDescription());
//        }
//        locationsFile.close();
        // Closing the output file/stream (vital to prevent resource leaks and locked files)
        // If an output file is NOT closed, the data can become corrupted, OR the file remain locked, so that
        // no other process is able to use it.
        // It's so important that Java7 introduced a better way of dealing with writing to files and correctly
        // closes them

        // We can handle Checked Exceptions in X ways;
        // 1. Create a try/catch statement to catch the exception
//        FileWriter locationsFile = null;
//        try {
//            locationsFile = new FileWriter("locations.txt");
//            for (Location location: locations.values()) {
//                locationsFile.write(location.getLocationID() + ", " + location.getDescription() + "\n");
//            }
//            locationsFile.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        // There is a problem with this code - An error in the for loop that writes the data will cause the catch
        // block to be entered prematurely, skipping over the class to the close method
        // As a result, the file isn't going to be properly closed.
        // To handle scenarios like this (i.e. where cleanup code that absolutely needs to be executed, no matter
        // what), the Java Exception Handling Mechanism also has a 'finally' block, and if there's an exception
        // raised in the try block, the code in the catch block for that exception will be executed, but then,
        // regardless of what happened, the finally block is also executed, so you can be certain the code will
        // be executed, as long as the JVM doesn't crash (which is very unlikely).
        // N.B. - A try block must have AT LEAST 1 of a catch OR finally block

        // 2. Create a try/catch/finally statement to catch the exception
//        FileWriter locationsFile = null; // We have to define locationsFile here because try, catch and finally
//        // blocks introduce new scope, so FileWriter declared inside a try block would not be available in
//        // catch or finally
//        try {
//            locationsFile = new FileWriter("locations.txt");
//            for (Location location: locations.values()) {
//                locationsFile.write(location.getLocationID() + ", " + location.getDescription() + "\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
////            locationsFile.close(); // Unhandled exception: java.io.IOException
//            try {
//                // We're trying to make the program as resilient as possible so that it doesn't crash
//                if (locationsFile != null) {
//                    locationsFile.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        // 3. Throw the Exception in the Calling Method
//        FileWriter locationsFile = null; // We have to define locationsFile here because try, catch and finally
//        // blocks introduce new scope, so FileWriter declared inside a try block would not be available in
//        // catch or finally
//        try {
//            locationsFile = new FileWriter("locations.txt");
//            for (Location location: locations.values()) {
//                locationsFile.write(location.getLocationID() + ", " + location.getDescription() + "\n");
//                // Throwing your own exceptions can be a really useful technique while testing
////                throw new IOException("Test Exception thrown while Writing");
//                // BUT you definitely wouldn't want to leave this in your code when it goes into production
//                // You can place a throw statement in code that you want to test to make sure that your
//                // catch and finally blocks work, BUT you need to make sure you delete them immediately
//                // after you've actually tested to avoid this situation.
//            }
//        // Catch block is unnecessary if the method can can throw exceptions
////        } catch (IOException e) {
////            e.printStackTrace();
//        } finally {
////            locationsFile.close(); // Unhandled exception: java.io.IOException
////            try {
//                // We're trying to make the program as resilient as possible so that it doesn't crash
//                if (locationsFile != null) {
//                    locationsFile.close();
//                }
////            } catch (IOException e) {
////                e.printStackTrace();
////            }
//        }

        // === try-with-resources Statement ===
        // Streamlines our code better, as it automatically ensures that the FileWriter stream is closed
        // whether the code executes normally or an Exception occurs
//        try (FileWriter locationsFile = new FileWriter("locations.txt")) {
//            for (Location location: locations.values()) {
//                locationsFile.write(location.getLocationID() + ", " + location.getDescription() + "\n");
//            }
//        }

        // Writing out the exits for each location as well as the locations
        // Using the try-with-resources form of the try block allows more than 1 resource to be specified,
        // and as a result we can actually create a 2nd FileWriter to write the exits data out.
        // As the code already loops through the locations, we'll create a new version with an inner loop to
        // write the exits for each location, rather than having 2 separate blocks of code
        try (FileWriter locationsFile = new FileWriter("locations.txt");
             FileWriter directionsFile = new FileWriter("directions.txt")) {
            for (Location location: locations.values()) {
                locationsFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
                // Cycle through each of the directions/exits for the current location, and write them out
                for (String direction: location.getExits().keySet()) {
//                    // to locations.txt (For my own curiosity)
//                    locationsFile.write("\t" + location.getLocationID() + ", " + direction + " - " + location.getExits().get(direction) + "\n");;
                    // to directions.txt
                    directionsFile.write(location.getLocationID() + "," + direction + "," + location.getExits().get(direction) + "\n");
                }
            }
        }
    }

    // Creating a Static Initialisation Block (SIB) to store the location data (Gets executed once when the
    // Locations class is loaded)
    // The class has a HashMap field called 'locations' which is also static, so there's really only 1 copy
    // of that shared by however many instances of the Locations class that are created.
    // There's no real reason to create more than 1 Locations object, BUT as we cannot make the Interface
    // Method static, we have to allow at least 1 Instance to be created, and of course once you do that,
    // you can't guarantee that someone else won't create more than 1 of them.
    // N.B. - There are ways to ensure that only 1 instance of the class can be created (e.g. Singleton
    // Design Pattern), BUT for this application, making the data static and ensuring its only initialised
    // once is actually fine, and using the SIB confirms that actually is the case
    static {
        // === Reading data from files ===
        // We'll use FileReader objects to get data from the 2 input streams (i.e. locations and directions
        // text files)
        // The process is very similar to when we have written out the data, but just the other way around.
        // The main difference is we need to pass the data into the individual strings and integers, so we'll
        // use the Scanner class to do so
        // We'll start off with try/catch/finally then ultimately convert to the try-with-resources implementation

        Scanner scanner = null;

        // 1. === try/catch/finally ===
        // --- locations.txt ---
        try {
            System.out.println("--- Attempting to read from locations.txt OR locations_big.txt ---");
            // Initialise scanner object to read from a file (rather than the keyboard)
//            scanner = new Scanner(new FileReader("locations.txt"));
            scanner = new Scanner(new FileReader("locations_big.txt"));
            // Tell the scanner that our data is delimited by commas
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {
                // 1st bit of info is the locationID. Retrieve that
                int locationID = scanner.nextInt();
                // Skip over the delimiter (comma) and continue to the next data we want
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
                System.out.println("Imported loc: " + locationID + ": " + description);
                // Create a Locations object with the extracted data
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(locationID, new Location(locationID, description, tempExit));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
                // N.B. - When the scanner object is closed, it also takes care of closing ANY stream that it
                // was using, provided that the stream object implements the Closeable Interface (which
                // FileReader does). Rather than using the term 'stream', it's probably more correct to refer
                // to FileReader as a 'readable', because the source for a scanner must be an object that
                // implements the Readable Interface
            }
        }

        // --- directions.txt --- (part of 234)
        try {
            System.out.println("--- Attempting to read from directions.txt OR directions_big.txt ---");
            // this time we use a BufferedReader to wrap the FileReader
//            scanner = new Scanner(new BufferedReader(new FileReader("directions.txt")));
            scanner = new Scanner(new BufferedReader(new FileReader("directions_big.txt")));
            // Set delimiters
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {
                // --- Version 1 ---
//                int locationID = scanner.nextInt();
//                scanner.skip(scanner.delimiter());
//                String direction = scanner.next(); // .next() returns the next complete token from the scanner
//                scanner.skip(scanner.delimiter());
//                String destination = scanner.nextLine(); // read to the end of the line (which is the only data there)
//                int destinationID = Integer.parseInt(destination);

                // --- Version 2 (using String.split()) ---
                String input = scanner.nextLine(); // entire current line
                String[] dataList = input.split(",");
                int locationID = Integer.parseInt(dataList[0]);
                String direction = dataList[1];
                int destinationID = Integer.parseInt(dataList[2]);

                System.out.println(locationID + ": " + direction + ": " + destinationID);
                // Create a Location object
                Location location = locations.get(locationID);
                location.addExit(direction, destinationID);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        // 2. === try-with-resources ===
        System.out.println("--- Attempting to read from locations.txt OR locations_big.txt with try-with-resources ---");
        try (Scanner scanner2 = new Scanner(new FileReader("locations_big.txt"))) {
            scanner2.useDelimiter(",");
            while (scanner2.hasNextLine()) {
                // 1st bit of info is the locationID. Retrieve that
                int locationID = scanner2.nextInt();
                // Skip over the delimiter (comma) and continue to the next data we want
                scanner2.skip(scanner2.delimiter());
                String description = scanner2.nextLine();
                System.out.println("Imported loc: " + locationID + ": " + description);
                // Create a Locations object with the extracted data
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(locationID, new Location(locationID, description, tempExit));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("--- Attempting to read from directions.txt OR directions_big.txt with try-with-resources ---");
        try (Scanner scanner2 = new Scanner(new BufferedReader(new FileReader("directions_big.txt")))) {
            // Set delimiters
            scanner2.useDelimiter(",");
            while (scanner2.hasNextLine()) {
                // --- Version 2 (using String.split()) ---
                String input = scanner2.nextLine(); // entire current line
                String[] dataList = input.split(",");
                int locationID = Integer.parseInt(dataList[0]);
                String direction = dataList[1];
                int destinationID = Integer.parseInt(dataList[2]);

                System.out.println(locationID + ": " + direction + ": " + destinationID);
                // Create a Location object
                Location location = locations.get(locationID);
                location.addExit(direction, destinationID);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. === try-with-resources (without scanner) === (Part of 236)
        System.out.println("--- Attempting to read from locations.txt OR locations_big.txt with try-with-resources ---");
        try (BufferedReader dirFile = new BufferedReader(new FileReader("locations_big.txt"))) {
            String input;
            while ((input = dirFile.readLine()) != null) {
                String[] data = input.split(",");
                // 1st bit of info is the locationID. Retrieve that
                int locationID = Integer.parseInt(data[0]);
                String description = data[1];
                System.out.println("Imported loc: " + locationID + ": " + description);
                // Create a Locations object with the extracted data
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(locationID, new Location(locationID, description, tempExit));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("--- Attempting to read from directions.txt OR directions_big.txt with try-with-resources ---");
        try (BufferedReader dirFile = new BufferedReader(new FileReader("directions_big.txt"))) {
            String input;
            while ((input = dirFile.readLine()) != null) {
                // --- Version 2 (using String.split()) ---
                String[] dataList = input.split(",");
                int locationID = Integer.parseInt(dataList[0]);
                String direction = dataList[1];
                int destinationID = Integer.parseInt(dataList[2]);

                System.out.println(locationID + ": " + direction + ": " + destinationID);
                // Create a Location object
                Location location = locations.get(locationID);
                location.addExit(direction, destinationID);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        // N.B. - It would really make more sense to read from a file, rather than hard-coding all this here
//        // In this contrived example we only have 6 locations to worry about, but in the full game there
//        // are 140 locations and the exits connecting them together are a lot more complex.
//        // Therefore, storing that info in a file is a better solution overall
//        // The 1st step is to write the data out to a file
//        Map<String, Integer> tempExits = new HashMap<String, Integer>();
//        // Effectively the exit
//        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", tempExits));
//
//        // Adding Exits (i.e. directions people can go from a given location)
//        // ===== Room 1 =====
//        tempExits = new HashMap<String, Integer>();
//        tempExits.put("N", 5);
//        tempExits.put("S", 4);
//        tempExits.put("E", 3);
//        tempExits.put("W", 2);
//        locations.put(1, new Location(1, "You are standing at the end of a road before a small bridge", tempExits));
////        tempExits.put("Q", 0);
//
//        // ===== Room 2 =====
//        tempExits = new HashMap<String, Integer>();
//        tempExits.put("N", 5);
//        locations.put(2, new Location(2, "You are at the top of a hill", tempExits));
////        tempExits.put("Q", 0);
//
//        // ===== Room 3 =====
//        tempExits = new HashMap<String, Integer>();
//        tempExits.put("W", 1);
//        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExits));
////        tempExits.put("Q", 0);
//
//        // ===== Room 4 =====
//        tempExits = new HashMap<String, Integer>();
//        tempExits.put("N", 1);
//        tempExits.put("W", 2);
//        locations.put(4, new Location(4, "You are in a valley beside a stream", tempExits));
////        tempExits.put("Q", 0);
//
//        // ===== Room 5 =====
//        tempExits = new HashMap<String, Integer>();
//        tempExits.put("S", 1);
//        tempExits.put("W", 2);
//        locations.put(5, new Location(5, "You are in the forest", tempExits));
////        tempExits.put("Q", 0);
    }

    // === Implementing Map Interface Methods ===
    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
