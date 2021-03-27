package Section_12_JavaCollections.Overview;

public class ComparableAndComparatorInterfaces {
    // 156. Comparable and Comparator Interfaces

    // The Collections framework includes classes that sort their elements, so to really use those properly, we
    // need to understand how that works in order to create our own classes that we can use or store in sorted
    // Collections. In previous videos we implemented the Comparable interface, so that we could experiment with
    // the Collections.sort() and reverse() methods, so we've seen how easy it is to create the 1 required
    // method of the Interface (i.e. the compareTo() method)

    // When a class (e.g. Seat) implements Comparable, we have to Override the compareTo() method, which is
    // often a very simple thing to do. A compareTo() method should return a number
    //  - < 0 if the object should sort less than the object that is being compared to.
    //  - > 0 if the object should sort greater than the object that is being compared to.
    //  - == 0 if the objects are equal.
    // If you were creating a compareTo() method for a class that's got more than 1 key field
    // (e.g. People's names - where you may want to sort on forename first, and then on surname)

    // There's another way to use the sort() method, and that's to pass it a Comparator.
    // The Comparator Interface is similar to a Comparable, and defines a single method: compare().
    // Unlike Comparable, the objects to be sorted DON'T have to implement Comparator, instead an Object of
    // Type Comparator can be created with a compare() method that can sort the objects.
    // More than 1 Comparator can be created, and this allows for objects to be sorted in different ways
    // We can either create a Comparator object within an existing class, OR we can create a new class that
    // implements the Comparator Interface

    // Comparator doesn't have to be static, but it makes it easier to use if we don't need a class instance
    // in order to use it (e.g. People.GROUP_ORDER)
    // You can also implement as many Comparators as you want (e.g. 1 for firstName and 1 for lastName???)

    // The Java Collections documentation uses a particular phrase regularly:
    // "An ordering being consistent with equals"
    // A method that produces ordering that is consistent with equals will only return 0 if the elements
    // being compared actually are equal
    // Comparable's compareTo() method IS consistent with equals - As we compare different objects and if they're
    // the same object, then they're equal (e.g. if we compare based on a unique field e.g. seatNumber)
    // Comparator's compare() method is NOT consistent with equals - As we compare different objects on
    // a non-unique field, and if they're the same, they're considered equal, even though they're not the same
    // object (e.g. price of seats)
    // This distinction causes problems
}
