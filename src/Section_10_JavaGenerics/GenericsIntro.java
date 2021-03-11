package Section_10_JavaGenerics;

import java.util.ArrayList;

public class GenericsIntro {
    // 136. Generics Intro

    // Just as we can create methods that take arguments in Java, and we can replace the parameters that we
    // declare for the method, Generics allow us to create classes, interfaces and methods that take types
    // as parameters called: Type Parameters
    // So, different to other parameters, we're talking about Type Parameters.

    // We've seen in previous videos when we created ArrayLists and LinkedLists

    public static void main(String[] args) {
        // ArrayList that doesn't use Generics
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);

//        items.add("ValidToAdd"); // This doesn't get noticed by the compiler, coz technically this is valid (problematic)
        // The problem is that we're specifying ArrayList (which is a Generic type) WITHOUT a type parameter
        // We effectively haven't said what kinds of objects we plan on storing in the ArrayList.
        // The ArrayList as we've used it here is a "raw" type
        // This old code was the only way to write back in earlier iterations of Java til Generics was introduced
        // This old code is kept functional for Backwards-Compatibility purposes.
        // Because type safety is so easy to implement these days in the modern versions of Java, it's worth doing

        // When we provide a type parameter to a generic type, this is called a Parametrised Type
        // (so we've specified the type in the past with angle brackets <>)

//        ArrayList<Integer> intItems = new ArrayList(); // Warning: Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList<java.lang.Integer>'
//        ArrayList<Integer> intItems = new ArrayList<Integer>();
        ArrayList<Integer> intItems = new ArrayList<>(); // Correct way to instantiate (using the "diamond")
        intItems.add(1);
        intItems.add(2);
        intItems.add(3);
        intItems.add(4);
        intItems.add(5);
//        intItems.add("ValidToAdd"); // NOW we get an error - which is what we want!
    }

    private static void printDoubled(ArrayList arr) {
        for (Object i: arr) {
            System.out.println((Integer)i * 2);
        }
    }

    private static void printDoubledBetter(ArrayList<Integer> arr) {
        for (int i: arr) {
            System.out.println((i * 2));
        }
    }
}
