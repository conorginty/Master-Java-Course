package Section_12_JavaCollections.Sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    // 167. Sets - Symmetric and Asymmetric

    public static void main(String[] args) {
        // Focusing on the main operations of a set (mathematical/algebraic operations)
        // https://docs.oracle.com/javase/tutorial/collections/interfaces/set.html

        // Set Interface Bulk Operations
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i=1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes");

        // ===== Union =====
        Set<Integer> union = new HashSet<>(squares); // add the elements from the squares set to here
        union.addAll(cubes); // To add all the cubes as well (therefore now a union)
        System.out.println("Union contains " + union.size() + " elements");

        // N.B. - Bulk Operations are Destructive (i.e. they modify the set they're called upon), we created a new
        // separate Set (i.e. union) to store the union of squares and cubes so we don't modify either of the sets
        // we've previously created.

        // Nearly all the Collection classes have Constructors that take another Collection and use the items in that
        // to populate the new Collection (which is what we did on ln24)
        // Another example;
        ArrayList<Integer> duplicates = new ArrayList<Integer>(Arrays.asList(1,1,1,2,2,3,3,3,3,4,5));
        System.out.println("Size of duplicates = " + duplicates.size());
        Set<Integer> uniques = new HashSet<>(duplicates);
        System.out.println("Size of uniques = " + uniques.size());

        // Going back to our Bulk Operations;
        // ===== Intersection =====
        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements");

        // ===== Difference =====
        // In Set Theory: 2 Differences are defined;
        // 1. Symmetric Difference
        // 2. Asymmetric Difference
        // The Java Set Interface defines a way to obtain the Asymmetric Difference of 2 sets using the .removeAll()
        // bulk operation, which will remove ALL elements in 1 set from another

        // We'll switch to smaller sets to see the removal in action
        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

//        for (String word: words) {
//            System.out.println(word);
//        }

        Set<String> nature = new HashSet<>();
        String[] natureWordList = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWordList));

        Set<String> divine = new HashSet<>();
        String[] divineWordList = {"to", "err", "is", "human", "to", "forgive", "is", "divine"};
        divine.addAll(Arrays.asList(divineWordList));

        System.out.println("=== nature - divine ===");
        Set<String> asymmetricDiff1 = new HashSet<>(nature);
        asymmetricDiff1.removeAll(divine);
        printSet(asymmetricDiff1);

        System.out.println("=== divine - nature ===");
        Set<String> asymmetricDiff2 = new HashSet<>(divine);
        asymmetricDiff2.removeAll(nature);
        printSet(asymmetricDiff2);

        // ===== Symmetric Difference =====
        // Java Set Interface does NOT have a Symmetric Difference method implemented (probably as it's used less
        // often in Set Theory)
        // Symmetric Difference is the elements that appear in 1 set, or the other, BUT NOT both
        // (i.e. union - intersection)
        Set<String> union2 = new HashSet<>(nature);
        union2.addAll(divine);
        Set<String> intersection2 = new HashSet<>(nature);
        intersection2.retainAll(divine);

        System.out.println("=== Symmetric Difference ===");
        union2.removeAll(intersection2);
        printSet(union2); // Contains the Symmetric Difference

        // === Contains All ===
        // containsAll() used to test if one Set is a Superset of another Set.
        // N.B. - Bulk Operation BUT NOT Destructive (just tests, doesn't modify the Sets)

        if (nature.containsAll(divine)) {
            System.out.println("divine is a subset of nature");
        }
        if (nature.containsAll(intersection2)) {
            System.out.println("intersection2 is a subset of nature");
        }
        if (divine.containsAll(intersection2)) {
            System.out.println("intersection2 is a subset of divine");
        }

    }

    private static void printSet(Set<String> set) {
        System.out.print("\t");
        for (String str: set) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
