package Section_12_JavaCollections.Sets;

public class SetsAndHashSet {
    // 163. Sets & HashSet

    // Looking at the Set Interface and HashSet
    // Sets are generally used less often than Lists and Maps, BUT can be extremely useful.
    // While a List is an ordered collection of items that can contain duplicates,
    // Sets, by contrast;
    // 1. Have NO defined ordering (The Oracle docs define it as 'chaotic')
    // 2. Can NOT contain duplicates
    // There are also Ordered Sets (e.g. LinkHashSet and TreeSet)

    // The Set Interface, just like everything else in the Collections framework, is Generic and takes a single type
    // Like Maps and Lists, it's possible to create a raw set, but this is intended for backwards compatibility
    // with code created before Generics were added to Java.
    // The Set Interface defines the basic methods: add(), remove() and clear(), to maintain the items in the
    // set, as well as offering a size() method and isEmpty() to provide info about how much or how many items
    // are actually in the set.
    // We can also check if a specific item is in the set using the contains() method.

    // The keys in a map can be retrieved as a set using the keySet() method, so everything that applies to
    // keys in a map ALSO applies to items in a set.
    // Using Immutable Objects as elements in a Set can cause problems, and the behaviour is undefined if
    // changing an object affects equal() comparisons.
    // Just as a map can NOT contain itself as a key, a Set can NOT be an element of itself

    // The best-performing version of a Set Interface is the HashSet class, which uses hashes to store the items
    // This is conceptually like a HashMap class that we've already looked at, and the HashSet implementation
    // uses a HashMap (as of Java 8, though may have changed since)
    // A set can be implemented with a map where you use the corresponding map object and use only the keys,
    // ignoring the values. This is what HashSet does, and whenever an element is added to the set, it becomes
    // a key in the underlying HashMap, and a dummy object is stored as the value.

    // Sets can be useful, because operations on them are very fast, and if you're dealing with the mathematical
    // notion of a set, then the Java Collection Sets really allow the usual set operations (i.e. union,
    // intersection etc).
}
