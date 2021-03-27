package Section_12_JavaCollections.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Insert key:value pairs using .put();
        Map<String, String> programmingLanguages = new HashMap<>();
        programmingLanguages.put("Java", "A compiled, high-level, object-oriented, platform-independent language");
        programmingLanguages.put("Python", "An interpreted, high-level, object-oriented, language with dynamic semantics");
        programmingLanguages.put("Algol", "An algorithmic language");
        programmingLanguages.put("BASIC", "Beginners All Purposes Instruction Code");
        programmingLanguages.put("Lisp", "Therein lies madness");

        // Retrieve values using .get();
        System.out.println(programmingLanguages.get("Python"));

        // An important feature of Maps is that the key is unique - so if you try and put a duplicate key,
        // the old value gets overwritten (rather than getting some sort of error like 'key already exists');

        programmingLanguages.put("Java", "This course is about Java");
        System.out.println(programmingLanguages.get("Java"));

        // The put() method itself can be used to tell if a value is being added for the 1st time, which
        // can be useful in certain circumstances to know that - and it does this by returning the previous
        // value if there was one.

        System.out.println(programmingLanguages.put("JavaScript", "Language used in Web Development")); // null
        System.out.println(programmingLanguages.put("JavaScript", "Language used in Web Development")); // Language used in Web Development
        System.out.println(programmingLanguages.put("JavaScript", "Fat Arrows and stuff...")); // Language used in Web Development
        System.out.println(programmingLanguages.put("JavaScript", "Nothing like Java!")); // Fat Arrows and stuff...

        // Now, obviously it's helpful to know what the previous value was, BUT it didn't prevent you from
        // adding it (i.e. it still got added, whether or not you wanted it to).
        // So, if you do want to determine and only add a key if it's not already there, we can do that as well
        // using the .containsKey() method.

        if (programmingLanguages.containsKey("Java")) {
            System.out.println("Java already exists as a key in the Map");
        } else {
            programmingLanguages.put("Java", "Putting in Java now...");
        }

        // Another variant of this is .putIfAbsent() that will only add to the map if the key is not already
        // present. However, this is moreso to prevent concurrency issues (so that 1 thread does not add to
        // the map, only for that entry to be overwritten by another thread).
        System.out.println("==========================");

        // Another thing we can do is remove items from the Map, but before doing that it would be really
        // useful to print out our Map's contents, so we can check that items are gone when we attempt to remove them.
        // 1 way to do this is to loop through the keys in the map using the .keySet() method, which returns a
        // set of all the keys

        for (String key: programmingLanguages.keySet()) {
            System.out.println(key + ": " + programmingLanguages.get(key));
        }
        System.out.println("==========================");

        // Part 158. Map Continued and Adventure Game

        // We'll use the remove() method to remove a specific key from a map. The way to remove is logical, and
        // there are 2 ways of doing it.
        // 1. remove
        programmingLanguages.remove("JavaScript");

        // 2. Remove a key, only if it's mapped to a certain value
        if (programmingLanguages.remove("Algol", "An algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol NOT removed, as k:v pairing not found...");
        }
        System.out.println("-------");

        for (String key: programmingLanguages.keySet()) {
            System.out.println(key + ": " + programmingLanguages.get(key));
        }
        System.out.println("==========================");

        // === Using the .replace() method ===
        // Used to replace the entry for a specified key if it's already mapped to a value

        System.out.println(programmingLanguages.replace("Lisp", "a functional programming language with imperative features")); // Therein lies madness
        System.out.println(programmingLanguages.replace("Scala", "Key doesn't exist, so won't be added")); // null

        for (String key: programmingLanguages.keySet()) {
            System.out.println(key + ": " + programmingLanguages.get(key));
        }
        System.out.println("==========================");

        System.out.println(programmingLanguages.replace("Lisp", "THIS WON'T WORK", "who even knows anymore")); // false
        System.out.println(programmingLanguages.replace("Lisp", "a functional programming language with imperative features", "This WILL work!!!")); // true

        for (String key: programmingLanguages.keySet()) {
            System.out.println(key + ": " + programmingLanguages.get(key));
        }

        // An example of where this variant is useful is, say you're updating someone's name after they got
        // married, you can ensure that the correct person gets updated so you're making sure that exact entry
        // gets updated, so there's no chance of accidentally overwriting the wrong information.
        System.out.println("==========================");

        // In this example we've used a Map that uses a String type for both the key and the value.
        // Both the keys and values can be ANY object - We can even use a Map type as the values in another Map.
        // You can add a Map as a value to itself, though it's probably NOT a good idea to do that.
        // Unlike other languages, like Python, there's no requirement for the keys be Immutable (like Strings, ints)
        // However, the Java documentation warns that great care must be exercised if Mutable objects are used
        // as Map keys (BUT they're NOT prohibited). The reason for the warning is that a Map object can behave
        // unpredictably if the key objects change in such a way that equals comparisons are affected.
        // Using, for example, Classes as keys, is pretty advanced (so we won't worry about it)
        // 1 thing that is NOT permitted is for a map to contain itself as a Key.
    }
}
