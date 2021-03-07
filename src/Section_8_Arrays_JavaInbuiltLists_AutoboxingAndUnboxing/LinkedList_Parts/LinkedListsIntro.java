package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.LinkedList_Parts;

public class LinkedListsIntro {
    // 116. Linked List Part 1

    // We've seen already that Arrays are indexed lists of elements
    // These elements can be primitives (ints, doubles etc) or Objects
    // We've seen both implemented in standard arrays, and objects implemented in ArrayLists.
    // Evidently these data structures are accessed by index (i.e. array[i] and ArrayList.get(i))

    // What happens internally (I THINK HE MEANS IN CASE OF LINKED LISTS, RATHER THAN ARRAYS???) is that Java
    // will allocate 4 bytes of memory for each integer that is stored in an LINKEDLIST??, in order for the
    // highest integer value to be stored.
    // Java will try and do this contiguously (where the physical memory addresses storing the data are beside
    // one another and consecutive). Java internally uses a formula to calculate the address when a value is stored
    // based on the index

    // In this example, the algorithm working under the hood works as follows;
    // - Base address is 100
    // - To get the address where value is stored, multiply the index by the number of bytes required to store an int
    // - Then add that result to the base address
    // - (e.g. desired value is at index 3. Therefore, the target address is 3 * 4 + 100 => Address 112.

    // The same principle applies for doubles, but instead of allocating 4 bytes, we allocate 8 bytes.
    // But what about Strings? They can be of variable size (and this applies to objects in general)
    // What happens under the hood is that the memory that's being allocated in the array is actually itself 8 bytes
    // But that actually points to another location in memory where the String is.
    // Consequently, by doing that, Java can keep track of the actual strings that are in the array, and the strings
    // can each be a variable length
}
