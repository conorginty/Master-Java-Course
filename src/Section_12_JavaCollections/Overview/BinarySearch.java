package Section_12_JavaCollections.Overview;

public class BinarySearch {
    // 154. Binary Search

    // In the Collections framework, you can use Interfaces on the same level BUT you MUST remain on the same level of hierarchy
    // e.g. We can use any Concrete Class that implements Set, List, Queue or Deque, BUT we CAN'T drop down a level and still expect things to work.
    // Their data structures can replace each other if on the same level as each other to tackle specific tasks.
    // As we move down the Hierarchy, the Interfaces become more specialised, so we can only replace classes
    // with other classes that implement 1 of the core collection interfaces at the same level.
    // From the Oracle documentation:
    // "A 'Set' is a special kind of 'Collection', a 'SortedSet' is a special kind of 'Set', and so on..."

    // Notice that the reserve() method in Theatre is not efficient in how it is written
    // It is a brute force approach, whereby each element is scanned until the one we want is found.
    // We should take advantage of a method provided by the Collections framework to binary search a list...
    // BUT in order to get that to work, we need to implement the Comparable Interface in our Seat class, so
    // that Java knows how to compare 2 seats.

    // ===== Algorithm Pseudocode =====

    // initialise low index of 0
    // initialise high index of the size of the search space - 1 (i.e. index of last element in sorted search space)

    // while low <= high
    //    initialise a middle index equal to (low + high) / 2 (i.e. index diractly between low and high indices)
    //    Grab the element found at the middle index
    //    Compare its value to what we are looking for

    //    if the result of the comparison is negative, that means the target is greater than the element at mid
    //        therefore, we move the low index forwards to 1 after the mid index.
    //    else if the result of the comparison is positive, that means the target is smaller than the element at mid
    //        therefore, we move the high index backwards to 1 before the mid index.
    //    otherwise, the comparison is equal (0), meaning we've found the target
    //        return the element at the mid index

    // Otherwise, we break out of the loop (coz low is now >= high), meaning the element does not exist in the search space
    // ===============================
}
