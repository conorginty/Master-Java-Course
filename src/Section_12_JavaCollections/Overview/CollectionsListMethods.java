package Section_12_JavaCollections.Overview;

public class CollectionsListMethods {
    // 155. Collections List Methods

    // Binary Search relies on the items in the List being sorted
    // Collections framework also provides a sort method, provided the elements in the list you wish to sort
    // implement the Comparable Interface.
    // The Collections default sort method uses Merge Sort, which is very efficient.
    // Collections also provides a reverse sort method to sort in reverse order

    // The Collections framework does provide a method to copy lists and other Collections objects, but it
    // doesn't really work as you may expect - It'll only copy a list into an existing one of at least the same size
    // To look at this we'll go the the Theatre class and make seats and Seat public (which we shouldn't really do)

    // The sorts of list methods we'll look at help to do the following;
    // - Create list copies
    // - Reverse the order
    // - Shuffle the order
    // - Return the Minimum element (based on the "natural" ordering of element (i.e. based on compareTo()))
    // - Return the Maximum element (based on the "natural" ordering of element (i.e. based on compareTo()))
}
