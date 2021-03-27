package Section_12_JavaCollections.SortedCollections;

public class SortedCollectionsOverview {
    // 172. Sorted Collections

    // We'll look at a variant of the HashMap and HashSet classes called the LinkedHashMap and LinkedHashSet
    // There are also the sorted versions of the Map and Set Interfaces - SortedMap and SortedSet that are implemented
    // in TreeMap and TreeSet, and we'll look at those as well
    // Because the operations on Sets and Maps are so similar, we'll focus moreso on Maps

    // The Linked variants of HashMap and HashSet are called LinkedHashMap and LinkedHashSet, and the only real
    // difference is that they have an intrinsic ordering to them.
    // The ordering in a normal HashMap or HashSet is considered 'chaotic', BUT the Linked versions maintain
    // Insertion Order, so once you put items in the Collection you know the order that the results will come back
    // when you iterate over it.

    // We'll create an example program that allows users to add purchases to a shopping basket after choosing them
    // from a list of all the items on sale.
    // To do this, we'll need to maintain 2 Collections;
    // 1. The list of all the Items that are in stock.
    // 2. The items that a Customer has added to their basket.

    // ******************
    // N.B - An ordered collection means that the elements of the collection have a specific order.
    // The order is independent of the value. A List is an example.
    // A sorted collection means that not only does the collection have order, but the order depends on the value
    // of the element.
    //
    // LinkedHashMap and LinkedHashSet are ORDERED, BUT NOT SORTED!!!!!!!!!!
    // TreeMap and TreeSet are ORDERED, AND SORTED!!!!!!!!!!

}
